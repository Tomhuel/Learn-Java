package io.github.tomhuel.repositoryinterface.Client.Repository;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;

import java.util.*;

public class ClientListRepository implements ByOrderPaginableClientRepository {

    private List<Client> dataSource = new ArrayList<>();


    public List<Client> get(String field) {
        return this.orderBy(field, Order.ASC);
    }

    @Override
    public List<Client> get(String field, Order order) {
        return this.orderBy(field, order);
    }

    @Override
    public List<Client> get() {
        return this.dataSource;
    }

    @Override
    public Client getById(Integer id) {
        for (Client client : this.dataSource) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public Client create(Client client) {
        this.dataSource.add(client);
        return this.dataSource.get(this.dataSource.size() - 1);
    }

    public Client create(String username, String email) {
        return this.create(new Client(username, email));
    }

    @Override
    public boolean delete(Integer id) {
        for (int i = 0; i < this.dataSource.size(); i++) {
            Client client = dataSource.get(i);
            if (client.getId().equals(id)) {
                this.dataSource.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Client client) {
        return this.delete(client.getId());
    }

    @Override
    public Client update(Integer id, String username, String email) {
        for (int i = 0; i < this.dataSource.size(); i++) {
            Client clientLoop = dataSource.get(i);
            if (clientLoop.getId().equals(id)) {
                this.dataSource.get(i).setEmail(email).setUsername(username);
                return this.getById(id);
            }
        }
        return null;
    }

    @Override
    public Client update(Integer id, String username) {
        Client client = this.getById(id);
        return this.update(id, username, client.getEmail());
    }

    @Override
    public List<Client> get(int from, int to) {
        return this.dataSource.subList(from, to);
    }

    @Override
    public List<Client> get(int from) {
        return this.get(from, this.dataSource.size());
    }

    private List<Client> orderBy(String field, Order order) {
        List<Client> list = new ArrayList<>(this.dataSource);
        list.sort((a, b) -> {
            int result = 0;
            switch (field) {
                case "id" -> result = a.compareTo(b);
                case "username" -> result = a.getUsername().compareTo(b.getUsername());
                case "email" -> result = a.getEmail().compareTo(b.getEmail());
            }
            if (order.equals(Order.DESC)) {
                result *= -1;
            }
            return result;
        });
        return list;
    }

    private List<Client> orderBy(String field) {
        return this.orderBy(field, Order.ASC);
    }
}
