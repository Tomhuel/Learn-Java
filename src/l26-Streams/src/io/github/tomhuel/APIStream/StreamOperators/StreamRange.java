package io.github.tomhuel.APIStream.StreamOperators;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRange {
    public static void execute() {
        System.out.println("· Stream Range");
        IntStream numbers = IntStream.range(5, 20);

//        System.out.println("sum = " + numbers.sum());
        IntSummaryStatistics stats = numbers.summaryStatistics();
        System.out.println("max = " + stats.getMax());
        System.out.println("min = " + stats.getMin());
        System.out.println("sum = " + stats.getSum());
        System.out.println("avg = " + stats.getAverage());
        System.out.println("size = " + stats.getCount());
    }
}
