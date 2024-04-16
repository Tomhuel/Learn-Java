package io.github.tomhuel.Collections.List;

import java.util.LinkedList;

public class Tail<T> {
    private LinkedList<T> elementList;

    public Tail() {
        this.elementList = new LinkedList<T>();
    }

    public int size() {
        return this.elementList.size();
    }

    public void add(T t) {
        this.elementList.addLast(t);
    }

    public T remove() {
        return this.elementList.removeFirst();
    }

    @Override
    public String toString() {
        return this.elementList.toString();
    }
}
