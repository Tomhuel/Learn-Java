package io.github.tomhuel.Optional.Operators;

import io.github.tomhuel.Repositories.ComputerRepository;

public class Operators {
    public static void execute() {
        ComputerRepository repository = new ComputerRepository();

        var intelComputer = repository.get().filter(c -> {
            return c.getCpu().getBrand().getName().equals("Intel");
        }).findFirst();

        intelComputer.ifPresent((a) -> {
            System.out.println(a.getName() + " " + a.getModel() + " - " + a.getCpu().getBrand().getName() + " " + a.getCpu().getModel());
        });
    }
}
