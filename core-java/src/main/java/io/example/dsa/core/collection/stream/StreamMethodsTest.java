package io.example.dsa.core.collection.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethodsTest {

    public static void main(String[] args) {
        List<Emp> empList = Arrays.asList(new Emp(1, "Test 1"),
                new Emp(2, "Test 2"));

        System.out.println("Count : " + empList.stream().count());
        System.out.println(empList.stream().map(e -> e.getId()).reduce((i,j)-> i+j));


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
    }
}
