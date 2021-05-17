package com.it.Test.demo1;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 50; i++) {
            System.out.println("嫁给我吧" + i);
        }
        return "答应";
    }
}
