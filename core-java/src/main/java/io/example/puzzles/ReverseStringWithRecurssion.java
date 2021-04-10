package io.example.puzzles;

public class ReverseStringWithRecurssion {

    public static void main(String[] args) {

        System.out.println(reverse("abcdef", ""));

    }

    private static String reverse(String s, String result) {

        if (s.length() == 0) {
            return result;
        }
        result = result + s.substring(s.length() -1);
        s = s.substring(0, s.length()-1);
        result = reverse(s, result);
        return result;
    }
}
