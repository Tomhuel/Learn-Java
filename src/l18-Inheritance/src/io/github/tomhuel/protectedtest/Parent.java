package io.github.tomhuel.protectedtest;

import io.github.tomhuel.protectedtest.children.Children;

public class Parent {
    protected String name;

    protected String getName() {
        return this.name;
    }

    private void test() {
        Children test = new Children();
//        test.getName(); Same as Children class. We cannot use getName because it's another Package.
    }
}
