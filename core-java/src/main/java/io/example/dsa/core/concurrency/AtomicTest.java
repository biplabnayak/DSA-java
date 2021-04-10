package io.example.dsa.core.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    volatile AtomicInteger integer = new AtomicInteger(0);

    public Integer increment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return integer.incrementAndGet();
    }


    public static void main(String[] args) {
        AtomicTest test = new AtomicTest();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(test.increment());
            }).start();
        }

        System.out.println();
    }
}
