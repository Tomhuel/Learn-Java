package io.github.tomhuel.repositoryinterface.Repository.AbstractClasses;

import io.github.tomhuel.repositoryinterface.BaseEntity.BaseEntity;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.DuplicatedIdException;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.GetDataAccessException;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.NotFoundException;
import io.github.tomhuel.repositoryinterface.Repository.Exceptions.SetDataAccessException;
import io.github.tomhuel.repositoryinterface.Repository.Interfaces.ByOrderPaginableClientRepository;
import io.github.tomhuel.repositoryinterface.Repository.Enums.Order;

import java.util.*;

public abstract class AbstractListRepository<T extends BaseEntity> implements ByOrderPaginableClientRepository<T> {

    protected final List<T> dataSource = new ArrayList<>();

    public List<T> get() {
        return this.dataSource;
    }

    public T getById(Integer id) throws GetDataAccessException {
        if (id == null) throw new GetDataAccessException("ID must not be null");
        if (id <= 0) throw new GetDataAccessException("ID must be a natural number");

        for (T t : this.dataSource) {
            if (t.getId().equals(id)) {
                return t;
            }
        }

        throw new NotFoundException("ID not found");
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
    public T create(T t) throws GetDataAccessException, SetDataAccessException {
        if (t == null) {
            throw new SetDataAccessException("Object provided cannot be null");
        }
        if (this.dataSource.contains(t)) {
            throw new DuplicatedIdException("An Element with this ID already exists");
        }
        this.dataSource.add(t);
        return this.dataSource.get(this.dataSource.size() - 1);
    }

    public boolean deleteById(Integer id) throws NotFoundException {
        for (int i = 0; i < this.dataSource.size(); i++) {
            T t = dataSource.get(i);
            if (t.getId().equals(id)) {
                this.dataSource.remove(i);
                return true;
            }
        }
        throw new NotFoundException("ID not found");
    }

    public boolean delete(T t) throws NotFoundException {
        return this.deleteById(t.getId());
    }

    public T update(T t) throws GetDataAccessException, SetDataAccessException {
        if (t == null) {
            throw new SetDataAccessException("Object provided cannot be null");
        }
        for (T tt : this.dataSource) {
            if (tt.getId().equals(t.getId())) {
                return this.update(tt.getId(), t);
            }
        }
        throw new NotFoundException("Object Not Found");
    }

    public T update(Integer id, T t) throws GetDataAccessException, SetDataAccessException {
        T tt = this.getById(id);
        if (t == null) {
            throw new SetDataAccessException("Object provided cannot be null");
        }
        Integer previousId = tt.getId();
        t.setId(previousId);
        this.dataSource.set(dataSource.indexOf(tt), t);
        return t;
    }
}
