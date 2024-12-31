package org.codexdei.api.stream.example;

import java.util.stream.Stream;

public class StreamDistinctExample {

    public static void main(String[] args) {

        //ejemplo con usuario, buscando por apellido
        Stream<String> names = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "David Rey","Elias Profeta", "David Rey")
                //devuelve un Stream con elementos distintos o no duplicados
                .distinct();

        names.forEach(System.out::println);


    }
}
