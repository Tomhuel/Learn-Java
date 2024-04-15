package io.github.tomhuel.repositoryinterface.Repository.Interfaces;

import io.github.tomhuel.repositoryinterface.Repository.Enums.Order;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.GetDataAccessException;

import java.util.List;

public interface ByOrderRepository<T> {
    List<T> get(String field, Order order);

    List<T> get(String field);
}
