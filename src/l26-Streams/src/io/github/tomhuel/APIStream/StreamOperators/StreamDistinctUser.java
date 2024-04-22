package io.github.tomhuel.APIStream.StreamOperators;

import io.github.tomhuel.APIStream.User;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDistinctUser {
    public static void execute() {
        System.out.println("· Stream Distinct User");
        Stream<String> names = Stream.of("William pinkerton", "Kayle", "karen", "chad", "William pinkerton", "Kayle", "karen", "chad", "William pinkerton", "Kayle", "karen", "chad");

        Function<String, String> parser = (string) -> {
            return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
        };

        IntStream users = names.map((name) -> {
            String[] split = name.split(" ");
            if (split.length == 1) {
                return new User(parser.apply(name));
            }
            return new User(parser.apply(split[0]), parser.apply(split[1]));
        }).distinct().mapToInt(u -> {
            if (u.getLastname() == null) {
                return u.getName().length();
            }
            return u.getName().length() + u.getLastname().length();
        });

        IntSummaryStatistics stats = users.summaryStatistics();

        System.out.println("stats = " + stats);
    }
}
