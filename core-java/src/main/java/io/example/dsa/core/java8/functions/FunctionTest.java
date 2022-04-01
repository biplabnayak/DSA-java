package io.example.dsa.core.java8.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {

    public static void main(String[] args) {

        // Test Consumer
        Consumer<String> c = s -> System.out.println("#### " + s + " ####");

        // Test Function
        Function<String, String> f = (s) -> s + "*";
        f = f.andThen(s -> s + "#");

        System.out.println(f.apply("Test"));
    }
}
