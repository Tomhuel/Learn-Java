package io.github.tomhuel.exceptions;

import io.github.tomhuel.exceptions.Calculator.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        tryCatchExample(args);
    }

    public static void tryCatchExample(String[] args) {
        String numerator = JOptionPane.showInputDialog("Introduce a numerator:");
        String denominator = JOptionPane.showInputDialog("Introduce a denominator:");
        try {
            double fraction = Calculator.division(numerator, denominator);
            System.out.println(fraction);
        } catch (CustomNumberFormatException e) {
            System.err.println(e.getMessage());
            main(args);
        } catch (NumberFormatException e) {
            System.err.println("Number Format Exception: " + e.getMessage());
            main(args);
        } catch (DivisionByZeroException e) {
            System.err.println("Division by Zero Error: " + e.getMessage());
            main(args);
        }
        System.out.println("Our app continues working :))");
    }
}
