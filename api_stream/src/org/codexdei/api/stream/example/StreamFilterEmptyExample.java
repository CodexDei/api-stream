package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterEmptyExample {

    public static void main(String[] args) {

        //busca datos vacios y devuelve el numero de datos vacios
        long count = Stream.of("Eliseo Profeta","", "David Rey", "","Maria DeJose", "Elias Profeta", "")
                    .filter(String::isEmpty)
                    .count();
        System.out.println("count:" + count);


    }
}
