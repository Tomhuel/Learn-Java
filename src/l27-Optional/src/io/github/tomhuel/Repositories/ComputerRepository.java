package io.github.tomhuel.Repositories;

import io.github.tomhuel.Models.CPU;
import io.github.tomhuel.Models.Computer;
import io.github.tomhuel.Models.Fabricator;
import io.github.tomhuel.Repositories.Interfaces.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ComputerRepository implements Repository<Computer> {

    private List<Computer> dataSource;

    public ComputerRepository() {
        this.dataSource = new ArrayList<>();
        CPU cpu1 = new CPU(new Fabricator("Intel"), "i5 12400F");
        CPU cpu2 = new CPU(new Fabricator("AMD"), "Ryzen 7 5700X");
        CPU cpu3 = new CPU(new Fabricator("Intel"), "i3 6100");
        this.dataSource.add(new Computer("MSI", "Calamity", cpu2));
        this.dataSource.add(new Computer("HP", "Omen", cpu3));
        this.dataSource.add(new Computer("Asus", "Zenbook", cpu1));
    }

    @Override
    public Optional<Computer> filter(String name) {
        return this.dataSource.stream().filter(c -> c.getName().toLowerCase().equals(name.toLowerCase())).findFirst();
    }

    public Stream<Computer> get() {
        return this.dataSource.stream();
    }
}
