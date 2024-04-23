package io.github.tomhuel.Repositories;

import io.github.tomhuel.Models.Computer;
import io.github.tomhuel.Repositories.Interfaces.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer> {

    private List<Computer> dataSource;

    public ComputerRepository() {
        this.dataSource = new ArrayList<>();
        this.dataSource.add(new Computer("MSI", "27GX1294"));
        this.dataSource.add(new Computer("Asus Zenbook", "14GS0019"));
    }

    @Override
    public Optional<Computer> filter(String name) {
        return this.dataSource.stream().filter(c -> c.getName().toLowerCase().equals(name.toLowerCase())).findFirst();
    }
}
