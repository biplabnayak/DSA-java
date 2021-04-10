package io.example.hackerrank.arrays;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos/problem
 */
public class NewYearChaos {

    static void minimumBribes(int[] q) {

        int ans = 0;
        for (int i = q.length -1; i >= 0; i-- ) {

            if (q[i] - (i+1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] -2); j < i; j++) {
                if (q[j] > q[i]) ans++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,3,4};
        minimumBribes(arr);
    }
}
