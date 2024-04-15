package io.github.tomhuel.repositoryinterface.Repository.Interfaces;

import io.github.tomhuel.repositoryinterface.Repository.Exceptions.GetDataAccessException;

import java.util.List;

public interface PaginableRepository<T> {
    List<T> get(int from, int to);
    List<T> get(int from);
}
