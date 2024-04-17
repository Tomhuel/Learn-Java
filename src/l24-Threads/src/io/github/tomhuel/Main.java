package io.github.tomhuel;

import io.github.tomhuel.Threads.ExtendsThread;

public class Main {
    public static void main(String[] args) {
        //executeExtendsThread();
    }

    public static void executeExtendsThread() {
        Thread thread1 = new ExtendsThread("Hello");
        Thread thread2 = new ExtendsThread("Goodbye");
        Thread thread3 = new ExtendsThread("Who am i?");
        System.out.println("thread1 = " + thread1.getState());
        System.out.println("thread2 = " + thread2.getState());
        System.out.println("thread3 = " + thread3.getState());
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread3.getState());
    }
}