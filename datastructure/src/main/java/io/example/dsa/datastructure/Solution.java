package io.example.dsa.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getAnagram("48"));
    }

    public static int getAnagram(String s) {

        if (s.length()%2 != 0) {
            return 0;
        }

        String s2 = s.substring(s.length()/2);
        String s1 = s.substring(0, s.length()/2);

        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                counter++;
            }
        }

        return counter;
    }
}
