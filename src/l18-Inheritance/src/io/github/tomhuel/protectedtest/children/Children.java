package io.github.tomhuel.protectedtest.children;

import io.github.tomhuel.protectedtest.Parent;

public class Children extends Parent {
    protected String cname;

    @Override
    protected String getName() {
        return super.getName();
    }

    protected void test() {
        Parent test = new Parent();
        // test.getName() // ! We cannot use directly protected functions from Parent class because is another package. We can inherit but we cannot use directly as third class
    }
}
