package io.example.hackerrank.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * There is a large pile of socks that must be paired by color.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 */
public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, AtomicInteger> map = new HashMap<>();

        for (int i : ar) {
            if (map.containsKey(i)) {
                map.get(i).incrementAndGet();
            } else {
                map.put(i, new AtomicInteger(1));
            }
        }

        int counter = 0;
        for (int i : map.keySet()) {
            counter = counter + (map.get(i).get() / 2);
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,1,2,3,4,6,1,1};
        System.out.println(sockMerchant(10, arr));
    }
}
