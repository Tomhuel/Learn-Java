package io.github.tomhuel.repositoryinterface.Repository;

import io.github.tomhuel.repositoryinterface.BaseEntity.BaseEntity;
import io.github.tomhuel.repositoryinterface.Client.Entity.Client;
import io.github.tomhuel.repositoryinterface.Product.Entity.Product;

import java.lang.reflect.Field;
import java.util.*;

public abstract class AbstractListRepository<T extends BaseEntity> implements ByOrderPaginableClientRepository<T> {

    protected final List<T> dataSource = new ArrayList<>();

    public List<T> get() {
        return this.dataSource;
    }

    public T getById(Integer id) {
        for (T t : this.dataSource) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public List<T> get(String field) {
        return this.orderBy(field);
    }

    public List<T> get(String field, Order order) {
        return this.orderBy(field, order);
    }

    abstract protected List<T> orderBy(String field, Order order);

    private List<T> orderBy(String field) {
        return this.orderBy(field, Order.ASC);
    }

    public List<T> get(int from, int to) {
        return this.dataSource.subList(from, to);
    }

    public List<T> get(int from) {
        return this.get(from, this.dataSource.size());
    }

    @Override
    public T create(T t) {
        this.dataSource.add(t);
        return this.dataSource.get(this.dataSource.size() - 1);
    }

    public boolean deleteById(Integer id) {
        for (int i = 0; i < this.dataSource.size(); i++) {
            T t = dataSource.get(i);
            if (t.getId().equals(id)) {
                this.dataSource.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean delete(T t) {
        return this.deleteById(t.getId());
    };

    public T update(T t) {
        for (int i = 0; i < this.dataSource.size(); i++) {
            T tt = this.dataSource.get(i);
            if (tt.getId().equals(t.getId())) {
                return this.update(tt.getId(), t);
            }
        }
        return null;
    };

    public T update(Integer id, T t) {
        T tt = this.getById(id);
        Integer previousId = tt.getId();
        t.setId(previousId);
        this.dataSource.set(dataSource.indexOf(tt), t);
        return t;
    };
}
