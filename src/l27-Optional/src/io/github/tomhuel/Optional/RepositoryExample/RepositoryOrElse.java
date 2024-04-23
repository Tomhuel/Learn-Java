package io.github.tomhuel.Optional.RepositoryExample;

import io.github.tomhuel.Models.Computer;
import io.github.tomhuel.Repositories.ComputerRepository;
import io.github.tomhuel.Repositories.Interfaces.Repository;

public class RepositoryOrElse {
    public static void execute() {
        Repository<Computer> computerRepository = new ComputerRepository();

        var msi = computerRepository.filter("MSI").orElseGet(() -> new Computer("", ""));
        var asus = computerRepository.filter("Asus Zenbook").orElse(new Computer("", ""));

        System.out.println(msi.getName());
        System.out.println(asus.getName());
    }
}
