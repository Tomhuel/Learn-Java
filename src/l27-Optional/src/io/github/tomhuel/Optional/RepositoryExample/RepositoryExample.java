package io.github.tomhuel.Optional.RepositoryExample;

import io.github.tomhuel.Models.Computer;
import io.github.tomhuel.Repositories.ComputerRepository;
import io.github.tomhuel.Repositories.Interfaces.Repository;

import java.util.Optional;
import java.util.function.Consumer;

public class RepositoryExample {
    public static void execute() {
        Repository<Computer> computerRepository = new ComputerRepository();

        long t1 = System.currentTimeMillis();
        var msi = computerRepository.filter("MSI");
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1 + "ms");
        var asus = computerRepository.filter("Asus Zenbook");

        Consumer<Optional<Computer>> print = (computer) -> {
            if (computer.isPresent()) {
                System.out.println(computer.get().getName() + " " + computer.get().getModel());
            } else {
                System.out.println("Computer not found");
            }
        };

        print.accept(msi);
        print.accept(asus);
    }
}
