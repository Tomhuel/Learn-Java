package io.github.tomhuel.repositoryinterface.Client.Repository;

import io.github.tomhuel.repositoryinterface.Client.Entity.Client;
import io.github.tomhuel.repositoryinterface.Repository.AbstractClasses.AbstractListRepository;
import io.github.tomhuel.repositoryinterface.Repository.Enums.Order;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.GetDataAccessException;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.NotFoundException;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.SetDataAccessException;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Client> {

    public Client update(Integer id, String username) throws GetDataAccessException, NotFoundException, SetDataAccessException {
        Client client = this.getById(id);
        if (client == null) {
            return null;
        }
        return this.update(id, username, client.getEmail());
    }

    public Client update(Integer id, String username, String email) throws GetDataAccessException, NotFoundException, SetDataAccessException {
        return this.update(id, new Client(username, email));
    }

    protected List<Client> orderBy(String field, Order order) {
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
}
