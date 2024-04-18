package io.github.tomhuel.Lambdas;

import io.github.tomhuel.Lambdas.Consumer.ConsumerExercise;
import io.github.tomhuel.Lambdas.Custom.Calculator;
import io.github.tomhuel.Lambdas.Custom.CustomLambda;
import io.github.tomhuel.Lambdas.Functions.LambaFunctionsExercise;
import io.github.tomhuel.Lambdas.Predicate.PredicateExercise;

public class Main {
    public static void main(String[] args) {
        ConsumerExercise.execute();
        LambaFunctionsExercise.execute();
        PredicateExercise.execute();

        CustomLambda sum = (a, b) -> a + b;
        CustomLambda multiply = (a, b) -> a + b;
        Calculator calc = new Calculator();
        double result1 = calc.calculate(1, 2, sum);
        double result2 = calc.calculate(2, 3, multiply);
        System.out.println(result1);
        System.out.println(result2);
    }
}