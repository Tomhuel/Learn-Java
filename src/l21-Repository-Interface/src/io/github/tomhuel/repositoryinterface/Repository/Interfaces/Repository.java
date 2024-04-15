package io.github.tomhuel.repositoryinterface.Repository.Interfaces;

import io.github.tomhuel.repositoryinterface.Repository.Exceptions.*;

import java.util.List;

public interface Repository<T> {
    List<T> get();
    T getById(Integer id) throws GetDataAccessException;
    T create(T t) throws SetDataAccessException, GetDataAccessException;
    boolean deleteById(Integer id) throws SetDataAccessException, NotFoundException;
    boolean delete(T t) throws SetDataAccessException, NotFoundException;
    T update(T t) throws SetDataAccessException, GetDataAccessException;
    T update(Integer id, T t) throws SetDataAccessException, GetDataAccessException;
}
