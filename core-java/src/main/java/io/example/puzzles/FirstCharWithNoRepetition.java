package io.example.puzzles;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * input : aassfssgrr
 * output: f
 */
public class FirstCharWithNoRepetition {

    public static void main(String[] args) {
        String input = "aassfssbrr";
        String[] arr = input.split("");

        Map<String, AtomicInteger> map = new LinkedHashMap<>();

        for (String s : arr) {
            if (map.get(s) != null) {
                map.get(s).addAndGet(1);
            } else {
                map.put(s, new AtomicInteger(1));
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s).get() == 1) {
                System.out.println(s);
                break;
            }
        }
    }
}
