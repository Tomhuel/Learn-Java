package io.github.tomhuel.repositoryinterface.Repository.Interfaces;

public interface ByOrderPaginableClientRepository<T> extends ByOrderRepository<T>, Repository<T>, PaginableRepository<T> {
}
