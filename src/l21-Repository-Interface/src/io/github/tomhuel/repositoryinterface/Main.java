package io.github.tomhuel.repositoryinterface;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;
import io.github.tomhuel.repositoryinterface.Product.Entity.Product;
import io.github.tomhuel.repositoryinterface.Product.Repository.ProductListRepository;
import io.github.tomhuel.repositoryinterface.Repository.AbstractListRepository;
import io.github.tomhuel.repositoryinterface.Client.Repository.ClientListRepository;
import io.github.tomhuel.repositoryinterface.Repository.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        clientCRUD();
        System.out.println("\n");
        productCRUD();
    }

    private static void clientCRUD() {
        System.out.println("· Clients Section");
        ClientListRepository CLR = new ClientListRepository();
        Client Tom = CLR.create(new Client("Tomhuel", "tomhuel@gmail.com")); // [Tomhuel]
        Client Crosso = CLR.create(new Client("Crosso", "crosso@gmail.com")); // [Tomhuel, Crosso]
        Client Kela = CLR.create(new Client("Kela", "kela@gmail.com")); // [Tomhuel, Crosso, Kela]
        CLR.getById(3); // Kela
        CLR.update(Tom.getId(), new Client(Tom.getUsername(), "tomas@gmail.com")); // Update {Username: Tomhuel, Email: tomas@gmail.com} tomhuel@gmail.com previously
        CLR.update(Crosso.getId(), Crosso.getUsername(), "crossomo@gmail.com");
        CLR.update(Kela.getId(), "Joche", "joche@gmail.com");
        Client newClient1 = CLR.create(new Client("Test1", "test1@gmail.com")); // Test Client with ID 4
        Client newClient2 = CLR.create(new Client("Test2", "test2@gmail.com")); // Test Client with ID 5
        deleteItem(CLR, 0); // Delete User that exists
        deleteItem(CLR, newClient1.getId()); // Delete User that exists
        deleteItem(CLR, newClient2.getId()); // Try to delete a User that doesn't exists
        List<Client> clientList = CLR.get("username", Order.DESC);
        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    private static void productCRUD() {
        System.out.println("· Products Section");
        ProductListRepository PLR = new ProductListRepository();
        Product Strawberry = PLR.create(new Product("Strawberry", "So delicious!", 3.99));
        Product Apples = PLR.create(new Product("Apple", "From a random tree in a random garden", 1.56));
        Product Watermelon = PLR.create(new Product("Watermelon", "Has a lot of water", 2.98));
        System.out.println(PLR.getById(Strawberry.getId()));
        PLR.update(Strawberry.getId(), Strawberry.getName(), Strawberry.getDescription(), 4.95);
        Product newProduct1 = PLR.create(new Product("Test 1", "This is the first test", 0.0));
        Product newProduct2 = PLR.create(new Product("Test 1", "This is the second test", 0.0));
        deleteItem(PLR, 0);
        deleteItem(PLR, newProduct1.getId());
        deleteItem(PLR, newProduct2.getId());
        List<Product> productList = PLR.get("name");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void deleteItem(AbstractListRepository list, int id) {
        if (list.deleteById(id)) {
            System.out.println("Element with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Element with ID " + id + " doesn't exists.");
        }
    }
}