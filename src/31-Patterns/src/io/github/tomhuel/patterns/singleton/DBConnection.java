package io.github.tomhuel.patterns.singleton;

public class DBConnection {

    private static DBConnection instance;

    private DBConnection() {
        System.out.println("Creating DBConnection...");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
