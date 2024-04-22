package io.github.tomhuel.APIStream.Parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ParallelStream {
    public static void execute() {
        System.out.println("· Pararell Streams");
        List<String> magicCreatures = new ArrayList<>();
        magicCreatures.add("Dwarf");
        magicCreatures.add("Mage");
        magicCreatures.add("Werewolf");
        magicCreatures.add("Skeleton");
        magicCreatures.add("Fairy");

        long t1 = System.currentTimeMillis();
        String names = magicCreatures.stream().parallel().flatMap(m -> {
            // All magicCreatures are executing at the same time this block.
            String finder = "Werewolf";

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (m.equals(finder)) {
                return Stream.of(finder);
            }
            return Stream.empty();
        }).flatMap(m -> {
            return Stream.of(magicCreatures.indexOf(m) + 1 + " · " + m);
        }).findAny().orElse("Human");
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1 + "ms");
        System.out.println(names);
    }
}
