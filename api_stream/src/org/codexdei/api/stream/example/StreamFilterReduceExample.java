package org.codexdei.api.stream.example;

import java.util.stream.Stream;

public class StreamFilterReduceExample {

    public static void main(String[] args) {

        //ejemplo con usuario, buscando por apellido
        Stream<String> names = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "David Rey","Elias Profeta", "David Rey")
                //devuelve un Stream con elementos distintos o no duplicados
                .distinct();

        String result = names.reduce("Concatenate:", (a,b) -> a + " || " + b);
        System.out.println(result);

        Stream<Integer> numbers = Stream.of(5,10,15,20,25);
        //reduce el stream sumando los elementos, en este caso empieza en cero
        //EL cero representa el numero que es sumara con el primer elemento
        int total = numbers.reduce(0,Integer::sum);

        System.out.println(total);


    }
}
