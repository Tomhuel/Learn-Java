package io.github.tomhuel.repositoryinterface.Client.Repository;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;

import java.util.List;

public interface ByOrderRepository {
    List<Client> get(String field, Order order);
}
