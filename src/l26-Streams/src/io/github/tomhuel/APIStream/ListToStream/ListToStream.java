package io.github.tomhuel.APIStream.ListToStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {
    public static void execute() {
        System.out.println("· List to Stream");
        List<String> magicCreatures = new ArrayList<>();
        magicCreatures.add("Dwarf");
        magicCreatures.add("Mage");
        magicCreatures.add("Werewolf");
        magicCreatures.add("Human");
        magicCreatures.add("Fairy");

        magicCreatures.stream().flatMap(m -> {
            return Stream.of(magicCreatures.indexOf(m) + 1 + " · " + m);
        }).forEach(System.out::println);
    }
}
