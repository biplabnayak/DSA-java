package io.example.dsa.core.concurrency;

import java.util.Map;
import java.util.concurrent.*;

public class CacheWrapper {

    private final Map<String, Integer> cache = new ConcurrentHashMap<>();


    public int getPrice(String company) {
        if (cache.containsKey(company)) {
            return cache.get(company);
        } else {
            synchronized (company) { // lock based on company
                if (cache.containsKey(company)) {
                    return cache.get(company);
                } else {
                    Integer price = calculatePrice(company);
                    cache.put(company, price);
                    return price;
                }
            }

        }
    }

    private Integer calculatePrice(String company) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //logic for calculating price
        return 0;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start = System.currentTimeMillis();

        CacheWrapper cacheWrapper = new CacheWrapper();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = executorService.submit(() -> cacheWrapper.getPrice("XYZ"));
        Future<Integer> f2 = executorService.submit(() -> cacheWrapper.getPrice("XYZ1"));

        executorService.shutdown();
        f1.get();
        f2.get();
        System.out.println("Time Taken : " + (System.currentTimeMillis() - start));

    }
}
