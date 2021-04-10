package io.example.dsa.core.errorhandling;

public class FinallyTest {

    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        try {
            System.out.println("in Try block");
//            return 0;
            throw new RuntimeException("Dummy Error");
        } catch (RuntimeException e) {
            System.out.println("in catch block");
            throw e;
            //return 1;
        }finally {
            System.out.println("in finally block");
            //return 2;
        }
    }
}
