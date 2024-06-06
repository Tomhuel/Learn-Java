package io.github.tomhuel;

import io.github.tomhuel.patterns.singleton.DBConnection;

public class Main {
    public static void main(String[] args) {
        singleton();
    }

    public static void singleton() {
        for (int i = 0; i < 10; i++) {
            // First time new instance, other loops just repeat the same instance.
            System.out.println(DBConnection.getInstance());
        }
    }
}