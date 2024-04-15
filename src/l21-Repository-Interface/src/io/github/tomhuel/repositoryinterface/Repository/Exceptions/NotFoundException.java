package io.github.tomhuel.repositoryinterface.Repository.Exceptions;

public class NotFoundException extends GetDataAccessException {
    public NotFoundException(String message) {
        super(message);
    }
}
