package xyz.tomhuel.javacourse.packages.user;

public class User {
    private String username;
    private int id;
    private static int lastId = 1;

    public User(String username) {
        this.id = lastId++;
        this.username = username;
    }

    public User() {
        this.id = lastId++;
        this.username = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.username;
    }
}
