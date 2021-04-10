package io.example.dsa.core.oops;

public class OverloadingTest {

    public void m1(String s) {
        System.out.println("String ..");
    }

    public void m1(Object s) {
        System.out.println("Object ..");
    }

    public static void main(String[] args) {
        new OverloadingTest().m1(1);
        new OverloadingTest().m1("s");
    }
}
