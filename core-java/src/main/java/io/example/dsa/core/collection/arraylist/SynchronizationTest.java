package io.example.dsa.core.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Testing {@link java.util.ArrayList} functionality
 *
 * @author Biplab Nayak
 */
public class SynchronizationTest {

    public static void main(String[] args) throws InterruptedException {

        List<String> syncArr = Collections.synchronizedList(new ArrayList<>(Arrays.asList("A","A","A","A","A","A","A","A","A")));
        //List<String> syncArr = new ArrayList<>(Arrays.asList("A","A","A","A","A","A","A","A","A"));

        Runnable writer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                syncArr.add(Thread.currentThread().getName());
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 9; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                syncArr.get(i);
            }
        };

        new Thread(writer).start();
        new Thread(writer).start();
        new Thread(writer).start();
        new Thread(writer).start();
        new Thread(reader).start();
        new Thread(reader).start();

        Thread.sleep(10000);
        System.out.println(syncArr);
        System.out.println();
    }
}
