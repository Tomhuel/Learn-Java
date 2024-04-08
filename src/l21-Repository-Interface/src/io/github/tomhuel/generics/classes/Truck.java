package io.github.tomhuel.generics.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Truck<T> implements Iterable<T> {
    private List<T> items;
    private int maxItems;

    public Truck(int maxItems) {
        this.maxItems = maxItems;
        this.items = new ArrayList();
    }

    public void add(T item) {
        if (this.items.size() < this.maxItems) {
            this.items.add(item);
        } else {
            throw new RuntimeException("Not enough space for this item!" + item);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }
}
