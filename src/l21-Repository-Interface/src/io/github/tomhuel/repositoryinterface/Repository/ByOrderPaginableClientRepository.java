package io.github.tomhuel.repositoryinterface.Repository;

public interface ByOrderPaginableClientRepository<T> extends ByOrderRepository<T>, Repository<T>, PaginableRepository<T> {
}
