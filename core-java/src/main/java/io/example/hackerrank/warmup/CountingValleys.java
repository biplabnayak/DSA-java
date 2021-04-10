package io.example.hackerrank.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 * TODO: complete
 */
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int v = 0;
        int lvl = 0;
        for (char c : path.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;

            if (lvl == 0 && c == 'U')
                ++v;
        }

        return v;
    }

    public static void main(String[] args) {
        assert countingValleys(8, "UDDDUDUU") == 1;
        assert countingValleys(12, "DDUUDDUDUUUD") == 2;
    }

}