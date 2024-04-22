package io.github.tomhuel.APIStream.StreamOperators;

import java.util.stream.Stream;

public class StreamFilterEmpty {
    public static void execute() {
        System.out.println("· Stream Filter Empty");
        Stream<String> names = Stream.of("William pinkerton", "Kayle", "Karen", "Chad", "", "");

        long emptyNames = names.filter(String::isEmpty).count();


        System.out.println(emptyNames);
    }
}
