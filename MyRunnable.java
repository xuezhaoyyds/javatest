package com.it.Test.demo1;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
