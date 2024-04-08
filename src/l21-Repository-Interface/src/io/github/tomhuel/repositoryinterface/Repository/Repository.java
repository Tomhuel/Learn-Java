package io.github.tomhuel.repositoryinterface.Repository;

import java.util.List;

public interface Repository<T> {
    List<T> get();
    T getById(Integer id);
    T create(T t);
    boolean deleteById(Integer id);
    boolean delete(T t);
    T update(T t);
    T update(Integer id, T t);
}
