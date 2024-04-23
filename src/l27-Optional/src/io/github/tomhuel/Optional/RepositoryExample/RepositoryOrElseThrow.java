package io.github.tomhuel.Optional.RepositoryExample;

import io.github.tomhuel.Models.Computer;
import io.github.tomhuel.Repositories.ComputerRepository;
import io.github.tomhuel.Repositories.Interfaces.Repository;

import java.util.Optional;

public class RepositoryOrElseThrow {
    public static void execute() {
        Repository<Computer> computerRepository = new ComputerRepository();

        var msi = computerRepository.filter("MSI").orElseThrow();
        var asus = computerRepository.filter("Asus Zenbook").orElseThrow(IllegalStateException::new);

        String extension = Optional.ofNullable("document.pdf").filter(f -> f.contains(".")).map(f -> f.substring(f.lastIndexOf(".") + 1)).orElseThrow();

        System.out.println(extension);
        System.out.println(msi.getName());
        System.out.println(asus.getName());
    }
}
