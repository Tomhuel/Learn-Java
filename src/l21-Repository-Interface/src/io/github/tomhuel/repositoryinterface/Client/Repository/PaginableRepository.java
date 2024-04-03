package io.github.tomhuel.repositoryinterface.Client.Repository;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;

import java.util.List;

public interface PaginableRepository {
    List<Client> get(int from, int to);
    List<Client> get(int from);
}
