package io.example.hackerrank.arrays;


/**
 * https://www.hackerrank.com/challenges/2d-array/problem
 */
public class SumOfHourGlass {

    static int hourglassSum(int[][] arr) {

        Integer maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                Integer sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };

        System.out.println(hourglassSum(arr));

    }

}
