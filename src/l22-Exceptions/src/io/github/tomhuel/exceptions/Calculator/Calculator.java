package io.github.tomhuel.exceptions.Calculator;

public class Calculator {
    public static double division(Integer n, Integer d) throws DivisionByZeroException {
        if (d.equals(0)) throw new DivisionByZeroException("Unable to divide with 0 as denominator");
        return (double) n / d;
    }

    public static double division(String n, String d) throws DivisionByZeroException, CustomNumberFormatException {
        try {
            int num = Integer.parseInt(n);
            int den = Integer.parseInt(d);
            return Calculator.division(num, den);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("Number Format Exception: " + e.getMessage());
        }
    }
}
