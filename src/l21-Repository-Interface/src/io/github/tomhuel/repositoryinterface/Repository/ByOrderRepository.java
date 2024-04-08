package io.github.tomhuel.repositoryinterface.Repository;

import java.util.List;

public interface ByOrderRepository<T> {
    List<T> get(String field, Order order);
    List<T> get(String field);
}
