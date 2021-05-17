package com.it.Test.demo1;

public class runableTest {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
