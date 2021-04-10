package io.example.hackerrank.warmup;

public class JumpingOnTheCloud {

    static int jumpingOnClouds(int[] c) {
        int jump = 0;

        for (int i = 0; i < c.length; ) {

            int nextToNext = i+2;

            if (nextToNext < c.length && c[nextToNext] != 1) {
                i = i + 2;
            } else {
                i++;
            }

            jump++;
            if (i >= c.length-1) break;
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,0,1,0};
        System.out.println(jumpingOnClouds(arr));
    }
}
