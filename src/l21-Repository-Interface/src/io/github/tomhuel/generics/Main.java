package io.github.tomhuel.generics;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;
import io.github.tomhuel.repositoryinterface.Client.Entity.ClientPremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Andrés", "Guzmán"));
        Client andres = clients.iterator().next();

        Client[] clientsArrays = {
                new Client("Hello", "Partner"),
                new Client("Im", "Learning"),
                new Client("How to use", "Generic Types")
        };

        ClientPremium[] clientPremiums = {
                new ClientPremium("Hello", "Partner"),
                new ClientPremium("Im", "Learning"),
                new ClientPremium("How to use", "Generic Types")
        };

        Integer[] numbers = {1, 2, 3, 4, 5};

        clients = fromArrayToList(clientsArrays);
        List<Integer> numbersList = fromArrayToList(numbers, numbers);
        List<Client> clientsPremiumsList = fromArrayToList(clientPremiums);
        printClients(clients);
        System.out.println(max(3.2, 3.1, 4.2, 1.2));
    }

    public static <T extends Number> List<T> fromArrayToList(T[] clients) {
        return Arrays.asList(clients);
    }

    public static <T> List<T> fromArrayToList(T[] clients) {
        return Arrays.asList(clients);
    }

    public static <T, G> List<T> fromArrayToList(T[] t, G[] g) {
        return Arrays.asList(t);
    }

    /*? extends because we cannot use ClientPremium within list. Just can with Client, but the ? extends enable us to use ClientPremium or any children*/
    public static void printClients(List<? extends Client> clients) {
        clients.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static <T extends Comparable<T>> T max(T... comparables) {
        if (comparables.length <= 1) {
            return comparables[0];
        }
        comparables[1] = comparables[0].compareTo(comparables[1]) > 0 ? comparables[0] : comparables[1];
        return max(Arrays.copyOfRange(comparables, 1, comparables.length));
    }
}
