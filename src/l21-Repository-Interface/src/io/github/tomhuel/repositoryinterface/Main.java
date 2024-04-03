package io.github.tomhuel.repositoryinterface;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;
import io.github.tomhuel.repositoryinterface.Client.Repository.ClientListRepository;
import io.github.tomhuel.repositoryinterface.Client.Repository.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientListRepository CLR = new ClientListRepository();
        CLR.create("Tomhuel", "tomhuel@gmail.com"); // [Tomhuel]
        CLR.create(new Client("Crosso", "crosso@gmail.com")); // [Tomhuel, Crosso]
        CLR.create("Kela", "kela@gmail.com"); // [Tomhuel, Crosso, Kela]
        CLR.getById(3); // Kela
        CLR.update(1, "Tomhuel", "tomas@gmail.com"); // Update {Username: Tomhuel, Email: tomas@gmail.com} tomhuel@gmail.com previously
        Client newClient1 = CLR.create("Test1", "test1@gmail.com"); // Test Client with ID 4
        Client newClient2 = CLR.create("Test2", "test2@gmail.com"); // Test Client with ID 5
        deleteUser(CLR, 4); // Delete User that exists
        deleteUser(CLR, 5); // Delete User that exists
        deleteUser(CLR, 6); // Try to delete a User that doesn't exists
        List<Client> clientList = CLR.get("id", Order.DESC);
        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    private static void deleteUser(ClientListRepository list, int id) {
        if (list.delete(id)) {
            System.out.println("User with ID " + id + " deleted successfully.");
        } else {
            System.out.println("User with ID " + id + " doesn't exists.");
        }
    }
}