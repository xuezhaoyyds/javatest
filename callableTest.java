package com.it.Test.demo1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class callableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable a1 = new MyCallable();
        FutureTask<String> f1 = new FutureTask<>(a1);
        Thread t1 = new Thread(f1);
        t1.start();
        String s = f1.get();
        System.out.println(s);
    }
}
