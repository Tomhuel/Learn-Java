package io.github.tomhuel.Optional.RepositoryExample;

import io.github.tomhuel.Models.CPU;
import io.github.tomhuel.Models.Computer;
import io.github.tomhuel.Models.Fabricator;
import io.github.tomhuel.Repositories.ComputerRepository;
import io.github.tomhuel.Repositories.Interfaces.Repository;

public class RepositoryOrElse {
    public static void execute() {
        Repository<Computer> computerRepository = new ComputerRepository();

        var msi = computerRepository.filter("MSI").orElseGet(() -> new Computer("", "", new CPU(new Fabricator(""), "")));
        var asus = computerRepository.filter("Asus Zenbook").orElse(new Computer("", "", new CPU(new Fabricator(""), "")));

        System.out.println(msi.getName());
        System.out.println(asus.getName());
    }
}
