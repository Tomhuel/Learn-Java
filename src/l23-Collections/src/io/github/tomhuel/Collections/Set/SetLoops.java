package io.github.tomhuel.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetLoops {
    public static void execute() {
        Set<String> hs = new HashSet<>();
        Set<String> ts = new TreeSet<>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");

        hashSetLoop(hs);
        treeSetLoop(ts);
    }

    public static void treeSetLoop(Set<String> ss) {
        // for loop
        System.out.println("TreeSet · Loop with for");
        for (String i : ss) {
            System.out.println(i);
        }

        System.out.println("TreeSet · Loop with foreach");
        ss.forEach(System.out::println);

        System.out.println("TreeSet · Loop with Iterator");
        Iterator<String> it = ss.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void hashSetLoop(Set<String> ss) {

        // for loop
        System.out.println("HashSet · Loop with for");
        for (String i : ss) {
            System.out.println(i);
        }

        // For Each Loop
        System.out.println("HashSet · Loop with foreach");
        ss.forEach(System.out::println);

        // Iterator
        System.out.println("HashSet · Loop with Iterator");
        Iterator<String> it = ss.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
