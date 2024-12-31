package org.codexdei.api.stream.example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExample {

    public static void main(String[] args) {

        IntStream numbers = IntStream.rangeClosed(5,20)
                .peek(System.out::println)
                ;
        //reduce el stream sumando los elementos, en este caso empieza en cero
        //EL cero representa el numero que es sumara con el primer elemento

        //int total = numbers.reduce(0,Integer::sum);
        //int total = numbers.sum();

       // System.out.println(total);

        IntSummaryStatistics statistics = numbers.summaryStatistics();
        System.out.println("Min:" + statistics.getMin());
        System.out.println("Max:" + statistics.getMax());
        System.out.println("Sum:" + statistics.getSum());
        System.out.println("Average:" + statistics.getAverage());
        System.out.println("Count:" + statistics.getCount());


    }
}
