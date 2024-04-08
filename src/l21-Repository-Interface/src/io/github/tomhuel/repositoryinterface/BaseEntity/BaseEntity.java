package io.github.tomhuel.repositoryinterface.BaseEntity;

public class BaseEntity {
    protected Integer id;
    protected static int lastId = 1;

    public BaseEntity() {
        this.id = lastId++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
