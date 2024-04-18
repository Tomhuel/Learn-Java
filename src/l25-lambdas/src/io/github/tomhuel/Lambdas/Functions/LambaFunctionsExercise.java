package io.github.tomhuel.Lambdas.Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambaFunctionsExercise {
    public static void execute() {
        // Create a lambda function
        Function<String, String> f1 = (param) -> {
            return param.substring(0, 1).toUpperCase() + param.substring(1).toLowerCase();
        };

        System.out.println(f1.apply("hello warakitipingaro"));

        BiFunction<String, String, String> f2 = (s1, s2) -> {
            return s1 + " " + s2;
        };
    }
}
