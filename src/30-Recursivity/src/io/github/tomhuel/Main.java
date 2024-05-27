package io.github.tomhuel;

import io.github.tomhuel.Models.Component;

public class Main {
    public static void main(String[] args) {
        Component pc = new Component("Case");
        Component psu = new Component("CoolerMaster 700W 80PLUS Bronze");
        Component cpu = new Component("AMD Ryzen 7 5700X");
        Component motherboard = new Component("Z790");
        Component RAM = new Component("Corsair 8Gb 3200Mhz");
        Component gpu = new Component("NVidia RTX 3070");
        Component cooler = new Component("Corsair Cooler");
        Component raid = new Component("RAID 1");
        Component hdd = new Component("Seagate HDD 1TB 7200RPM");

        raid.addComponent(hdd).addComponent(hdd).addComponent(hdd).addComponent(hdd);
        motherboard.addComponent(cpu).addComponent(RAM).addComponent(RAM).addComponent(gpu).addComponent(cooler);
        pc.addComponent(psu).addComponent(motherboard).addComponent(raid);
        printAllComponents(pc);
    }

    public static void printAllComponents(Component component, String tab) {
        System.out.println(tab + component.getName());
        if (component.hasChildren()) {
            component.getChildren().forEach(c -> printAllComponents(c, tab + "\t"));
        }
    }

    public static void printAllComponents(Component component) {
        System.out.println(component.getName());
        if (component.hasChildren()) {
            component.getChildren().forEach(c -> printAllComponents(c, "\t"));
        }
    }
}