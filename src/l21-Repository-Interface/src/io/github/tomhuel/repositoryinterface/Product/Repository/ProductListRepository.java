package io.github.tomhuel.repositoryinterface.Product.Repository;

import io.github.tomhuel.repositoryinterface.Product.Entity.Product;
import io.github.tomhuel.repositoryinterface.Repository.AbstractClasses.AbstractListRepository;
import io.github.tomhuel.repositoryinterface.Repository.Enums.Order;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.GetDataAccessException;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.SetDataAccessException;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository extends AbstractListRepository<Product> {

    @Override
    protected List<Product> orderBy(String field, Order order) {
        List<Product> list = new ArrayList<>(this.dataSource);
        list.sort((a, b) -> {
            int result = 0;
            switch (field) {
                case "id" -> result = a.compareTo(b);
                case "name" -> result = a.getName().compareTo(b.getName());
                case "description" -> result = a.getDescription().compareTo(b.getDescription());
                case "price" -> result = a.getPrice().compareTo(b.getPrice());
            }
            if (order.equals(Order.DESC)) {
                result *= -1;
            }
            return result;
        });
        return list;
    }

    public Product update(Integer id, String name, String description, Double price) throws GetDataAccessException, SetDataAccessException {
        return this.update(id, new Product(name, description, price));
    }

    public Product update(Integer id, String name, String description) throws GetDataAccessException, SetDataAccessException {
        Product product = this.getById(id);
        if (product == null) {
            return null;
        }
        return this.update(id, new Product(name, description, product.getPrice()));
    }

    public Product update(Integer id, String name) throws GetDataAccessException, SetDataAccessException {
        Product product = this.getById(id);
        if (product == null) {
            return null;
        }
        return this.update(id, new Product(name, product.getDescription(), product.getPrice()));
    }
}
