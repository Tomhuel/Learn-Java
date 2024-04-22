package io.github.tomhuel.APIStream.StreamOperators;

import java.util.stream.Stream;

public class StreamDistinct {
    public static void execute() {
        System.out.println("· Stream Distinct");
        Stream<String> names = Stream.of("William pinkerton", "Kayle", "Karen", "Chad", "", "", "William pinkerton", "Kaylee");

        Stream<String> distinctNames = names.distinct();


        System.out.println(distinctNames.toList());
    }
}
