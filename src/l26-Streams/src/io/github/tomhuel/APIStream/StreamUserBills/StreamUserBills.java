package io.github.tomhuel.APIStream.StreamUserBills;

import io.github.tomhuel.APIStream.Bill;
import io.github.tomhuel.APIStream.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUserBills {
    public static void execute() {

        User will = new User("Will", "Smith");
        User jen = new User("Jennifer", "Lawrence");

        will.addBill(new Bill("My new private Jett")).addBill(new Bill("This lambo goes BRRRRR"));
        jen.addBill(new Bill("Trip to Alaska")).addBill(new Bill("QUASO at France"));

        List<User> users = Arrays.asList(will, jen);

        users.stream().flatMap(u -> {
            StringBuilder result = new StringBuilder();
            result.append("Bills of ").append(u.getName()).append(" ").append(u.getLastname()).append(":\n");
            u.getBills().forEach(b -> {
                result.append("\t- ").append(b.getDescription()).append("\n");
            });
            return Stream.of(result.toString());
        }).forEach(System.out::println);
    }
}
