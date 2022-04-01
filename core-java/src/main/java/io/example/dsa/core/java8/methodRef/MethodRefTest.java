package io.example.dsa.core.java8.methodRef;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRefTest {

    public static void main(String[] args) {

        Function<Emp, Integer> f = Emp::getId;

        Consumer<Emp> c = Emp::print;
        c.accept(new Emp(1, "test"));


    }

    public static class Emp {

        Integer id;
        String name;

        public Emp(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void print() {
            System.out.println(this);
        }
    }
}
