package io.example.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        List<Integer> aIndex = new ArrayList<>();

        String[] arr = s.split("");
        for (int i = 0; i < s.length(); i ++) {
            if (arr[i].equals("a")) {
                aIndex.add(i);
            }
        }

        long rep = n / s.length();
        long reminder = n % s.length();

        long extra = 0;
        for (Integer i : aIndex) {
            if (i <= reminder-1) {
                extra++;
            }
        }

        return (rep * aIndex.size()) + extra;
    }

    public static void main(String[] args) {

        System.out.println(repeatedString("aba", 10L));
    }
}
