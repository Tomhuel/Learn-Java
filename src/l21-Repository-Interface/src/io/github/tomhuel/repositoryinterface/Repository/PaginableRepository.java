package io.github.tomhuel.repositoryinterface.Repository;

import java.util.List;

public interface PaginableRepository<T> {
    List<T> get(int from, int to);
    List<T> get(int from);
}
