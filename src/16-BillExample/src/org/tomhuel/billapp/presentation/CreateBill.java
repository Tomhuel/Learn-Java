package org.tomhuel.billapp.presentation;

import org.tomhuel.billapp.application.GetProducts;
import org.tomhuel.billapp.domain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CreateBill {
    public static Bill create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Bill:");
        System.out.println("Introduce the client's name: ");
        String clientName = scanner.next();
        System.out.println("Introduce the client's NIF: ");
        String clientNIF = scanner.next();
        System.out.println("Now we gonna add the products that you need.");
        ArrayList<Product> products = GetProducts.getProducts();
        ArrayList<BillItem> billItems = new ArrayList<>();
        boolean addingProducts = true;
        while (addingProducts) {
            System.out.println("Press 0 to finish add products");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println((i + 1) + ". " + product.getName() + " - " + product.getPrice() + "€");
            }
            Integer option = scanner.nextInt();
            if (option <= 0) {
                System.out.println("Add products phase ended");
                addingProducts = false;
                break;
            }
            if (option > products.size()) {
                System.out.println("That product doesn't exists");
            } else {
                Product product = products.get(option - 1);
                System.out.println("How many " + product.getName() + " do you want?");
                Integer amount = scanner.nextInt();
                if (amount > 0) {
                    System.out.println(product.getName() + " added.");
                    billItems.add(new BillItem(product, amount));
                } else {
                    System.out.println("You cannot add under 1 products!");
                }
            }
        }
        System.out.println("Add a description for the Bill:");
        String description = scanner.next();
        Bill bill = new Bill(new Client(clientName, clientNIF), billItems, description, new Date());
        return bill;
    }
}
