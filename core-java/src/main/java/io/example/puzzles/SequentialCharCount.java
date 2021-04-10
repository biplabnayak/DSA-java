package io.example.puzzles;

/**
 * input : aaabbeedcca
 * output: a3b2e2d1c2a1
 */
public class SequentialCharCount {
    public static void main(String[] args) {

        String input = "aaabbeedcca";

        String[] arr = input.split("");

        String prevChar=null;
        int counter = 1;
        for (int i=0; i<arr.length; i++) {
            String s = arr[i];
            if (prevChar == null) {
                prevChar = s;
                continue;
            }

            if (prevChar.equals(s)) {
                counter++;
            } else {
                System.out.print(prevChar+counter);
                counter=1;
                prevChar=s;
            }

            if (i==arr.length-1) {
                System.out.print(prevChar+counter);
            }

        }
    }
}



