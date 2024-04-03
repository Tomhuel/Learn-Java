package io.github.tomhuel.interfaces.printer.Model;

public interface Printable {

    // Default Variables
    final static String defaultText = "Text Default";

    default String print() {
        String className = this.getClass().getName();
        return "This " + className.substring(className.lastIndexOf(".") + 1) + " is Printable";
    }

    static void print(Printable printable) {
        System.out.println(printable.print());
    }
}
