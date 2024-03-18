package org.tomhuel.billapp.domain;

public class Client {
    private String name;
    private String NIF;

    public Client(String name, String NIF) {
        this.name = name;
        this.NIF = NIF;
    }

    public String getName() {
        return name;
    }

    public String getNIF() {
        return NIF;
    }
}
