package org.tomhuel.billapp.domain;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bill {
    private final Client client;
    private final ArrayList<BillItem> items;
    private final Integer id;
    private final String description;
    private final Date datetime;

    private static Integer lastId = 1;

    public Bill(Client client, ArrayList<BillItem> items, String description, Date datetime) {
        this.id = lastId++;
        this.client = client;
        this.items = items;
        this.datetime = datetime;
        this.description = description;
    }

    public Double getTotalPrice() {
        Double totalPrice = 0.0;
        for (BillItem item : this.items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    public String seeDetails() {
        StringBuilder output = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        output.append("Bill N.").append(this.id).append("\n");
        output.append("Client: ").append(this.client.getName()).append(" - ").append(client.getNIF()).append("\n");
        output.append("Description: ").append(this.description).append("\n");
        output.append("Date: ").append(dateFormat.format(this.datetime)).append("\n");
        for (int i = 0; i < this.items.size(); i++) {
            BillItem item = this.items.get(i);
            output.append("Product n.").append(i + 1).append(": ").append(item).append("\n");
        }
        output.append("Total: ").append(decimalFormat.format(this.getTotalPrice()));
        return output.toString();
    }

    @Override
    public String toString() {
        return this.seeDetails();
    }
}
