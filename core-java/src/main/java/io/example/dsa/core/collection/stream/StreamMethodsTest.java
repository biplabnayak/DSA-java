package io.example.dsa.core.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMethodsTest {

    public static void main(String[] args) {
        List<Emp> empList = Arrays.asList(new Emp(1, "Test 1"),
                new Emp(2, "Test 2"), new Emp(3, "Test 2"));

        // Count
        System.out.println("Count : " + empList.stream().count());

        // Reduce
        System.out.println(empList.stream().map(e -> e.getId()).reduce((i,j)-> i+j));

        // Grouping By
        Map<String, List<Emp>> map = empList.stream()
                .collect(Collectors.groupingBy(
                        Emp::getName));
        System.out.println(map);

        Map<String, List<Emp>> map2 = empList.stream()
                .collect(Collectors.groupingBy(
                        Emp::getName,
                        Collectors.mapping(Function.identity(), Collectors.toList())
                ));
        System.out.println(map2);

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
