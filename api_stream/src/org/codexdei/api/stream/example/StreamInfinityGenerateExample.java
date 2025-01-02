package org.codexdei.api.stream.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamInfinityGenerateExample {

    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(0);

        Stream.generate( () ->

        {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return counter.incrementAndGet();

        })
        .limit(7)
        .forEach(System.out::println);
        ;
    }
}
