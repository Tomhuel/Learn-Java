package io.github.tomhuel.exceptions;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        tryCatchExample(args);
    }

    public static void tryCatchExample(String[] args) {
        String sValue = JOptionPane.showInputDialog("Introduce a number:");
        try {
            int value = Integer.parseInt(sValue);
            int fraction = 10 / value;
            System.out.println(fraction);
        } catch (NumberFormatException e) {
            System.err.println("Number Format Error: " + e.getMessage());
            main(args);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Error: " + e.getMessage());
            main(args);
        }
        System.out.println("Our app continues working :))");
    }
}
