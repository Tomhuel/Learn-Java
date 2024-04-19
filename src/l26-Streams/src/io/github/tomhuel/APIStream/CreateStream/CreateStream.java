package io.github.tomhuel.APIStream.CreateStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void execute() {
        // Build from raw values
        System.out.println("· Create Stream");
        Stream<String> names = Stream.of("William", "Kayle", "Chad", "Karen");
        names.forEach(e -> {
            System.out.println(e);
        });

        //  Build from an Array
        String[] arr = {"William", "Kayle", "Chad", "Karen"};
        names = Arrays.stream(arr);


        // Stream Builder (Builder Pattern)
        names = Stream.<String>builder().add("William").add("Kayle").add("Chad").add("Karen").build();

        names.forEach(System.out::println);

        // Build from a Collection
        List<String> list = new ArrayList<>();
        list.add("William");
        list.add("Kayle");
        list.add("Chad");
        list.add("Karen");

        names = list.stream();
        System.out.println(names.toList());
    }
}
