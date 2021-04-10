package io.example.dsa.core.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingTest {

    private static class Parent {
        void m1() {}
        Object m2(){return "";}
        void m3(Integer i) {}
        void m4(Integer i) throws IOException {}
        void m5(Object o){}
    }

    private static class Child extends Parent {
        @Override
        void m1() {}

        @Override
        Integer m2(){return 1;} // Different return type must be a subclass of parent return type

        //@Override // Different parameter - not overriding .. its overloading
        void m3(String s){}

        void m4(Integer i) throws FileNotFoundException {} // Can throw same of subclass of the exception

        //@Override// this is not override .. as arg type is different. it is overload
        void m5(String o){};
    }
}
