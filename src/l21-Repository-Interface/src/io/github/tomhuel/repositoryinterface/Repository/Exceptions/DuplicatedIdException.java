package io.github.tomhuel.repositoryinterface.Repository.Exceptions;

public class DuplicatedIdException extends SetDataAccessException {
    public DuplicatedIdException(String message) {
        super(message);
    }
}
