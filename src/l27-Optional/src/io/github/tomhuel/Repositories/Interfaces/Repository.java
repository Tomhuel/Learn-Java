package io.github.tomhuel.Repositories.Interfaces;

import io.github.tomhuel.Models.Computer;

import java.util.Optional;

public interface Repository<T> {
    Optional<Computer> filter(String name);
}
