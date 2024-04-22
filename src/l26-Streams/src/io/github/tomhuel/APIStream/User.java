package io.github.tomhuel.APIStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name, lastname;
    private List<Bill> bills;

    public User(String name, String lastname) {
        this(name);
        this.lastname = lastname;
    }

    public User(String name) {
        this.name = name;
        this.bills = new ArrayList<>();
    }

    public List<Bill> getBills() {
        return bills;
    }

    public User addBill(Bill bill) {
        this.bills.add(bill);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
