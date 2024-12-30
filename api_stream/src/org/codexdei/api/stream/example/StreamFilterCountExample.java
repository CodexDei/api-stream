package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.stream.Stream;

public class StreamFilterCountExample {

    public static void main(String[] args) {

        //busca un dato y retorna true o false dependiendo de si lo encuentra
        long count = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "Elias Profeta")
                .map(name -> new User(name.split(" ")[0],
                                             name.split(" ")[1]))
                .peek(System.out::println)
                .count()
                ;
        System.out.println("How many elements are in the Stream?:" + count);

    }
}
