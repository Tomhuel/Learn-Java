package io.github.tomhuel.repositoryinterface.Client.Entity;

import java.util.Objects;

public class Client implements Comparable {
    private Integer id;
    private static int lastId = 1;
    private String username;
    private String email;

    public Client(String username, String email) {
        this();
        this.email = email;
        this.username = username;
    }

    private Client() {
        this.id = lastId++;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Client setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        String ClassName = this.getClass().getName();
        String output = ClassName.substring(ClassName.lastIndexOf(".") + 1) + " {";
        output += "\n\tId: " + this.id + ",";
        output += "\n\tusername: " + this.username + ",";
        output += "\n\temail: " + this.email;
        output += "\n}";
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(username, client.username) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Client)) {
            throw new IllegalArgumentException("A Client must be provided");
        }
        Client client = (Client) obj;
        return this.id.compareTo(client.getId());
    }
}
