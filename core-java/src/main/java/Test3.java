import io.example.dsa.core.concurrency.AtomicTest;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test3 {

    public static void main(String[] args) {
        Stream s1 = Stream.of(1, 3);
        Stream s2 = Stream.of(2,4, 5);

        List l = new ArrayList();
        int window = 2;
        AtomicInteger it = new AtomicInteger(0);

        Stream.of(s1,s2)
                .flatMap(s -> s)

                .forEach(i-> {
                    l.add(i);
                    it.incrementAndGet();
                    int x = 0;
                    if (it.get() > window) {
                        x = it.get() -window;
                    }
                    movingAvg(l.stream(), x);
                });
    }

    static private Double movingAvg(Stream s, int i) {
        return s.skip(i)
                .mapToInt(i1 -> (int)i1)
                .average().getAsDouble();
    }



}
