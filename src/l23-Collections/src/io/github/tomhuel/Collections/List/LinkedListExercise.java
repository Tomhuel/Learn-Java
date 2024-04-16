package io.github.tomhuel.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedListExercise {
    public static void execute() {
        LinkedList<String> ll = new LinkedList<>();

        // Normal add
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");

        // Add as last element
        ll.addLast("G");
        ll.addLast("H");
        ll.addLast("I");

        // Add as first element
        ll.addFirst("A");

        // Get Amount of Elements (same as length in arrays)
        int amount = ll.size();
        System.out.println(amount); // 9

        System.out.println(ll);

        // How to get data
        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());
        System.out.println("Index 2: " + ll.get(2));

        // How to remove data
        System.out.println("First removed: " + ll.removeFirst());
        System.out.println("Last removed: " + ll.removeLast());
        System.out.println("Index 2 removed: " + ll.remove(2));
        System.out.println(ll);

        // How to get index
        int index = ll.indexOf("E");
        System.out.println("Index of E: " + index);

        // How to set
        System.out.println(ll.set(index, "Z"));

        // Iterator and Loops
        ListIterator<String> li = ll.listIterator();

        while (li.hasNext()) {
            System.out.print(li.next() + ", ");
        }

        System.out.println();

        // Comeback to start:
        while (li.hasPrevious()) {
            System.out.print(li.previous() + ", ");
        }

        System.out.println();

        for (String i : ll) {
            System.out.print(i + ", ");
        }

        System.out.println();

        ll.forEach(c -> {
            System.out.print(c + ", ");
        });
    }
}
