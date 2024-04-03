package io.github.tomhuel.repositoryinterface.Client.Repository;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;

import java.util.List;

public interface ClientRepository {
    List<Client> get();
    Client getById(Integer id);
    Client create(Client client);
    boolean delete(Integer id);
    boolean delete(Client client);
    Client update(Integer id, String username, String email);
    Client update(Integer id, String username);
}
