package io.github.tomhuel.Lambdas.Custom;

public class Calculator {
    public double calculate(double a, double b, CustomLambda lambda) {
        return lambda.operation(a, b);
    }
}
