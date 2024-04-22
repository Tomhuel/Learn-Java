package io.github.tomhuel.APIStream.StreamOperators;

import java.util.stream.Stream;

public class StreamReduce {
    public static void execute() {
        System.out.println("· Stream Reduce");
        Stream<Integer> numbers = Stream.of(1, 4, 9, 12, 76, 4, 2, 34, 6, 876, 15, 3);

        Integer result = numbers.reduce(0, Integer::sum);

        System.out.println(result);
    }
}
