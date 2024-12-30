package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.stream.Stream;

public class StreamFilterAnyMatchExample {

    public static void main(String[] args) {

        //busca un dato y retorna true o false dependiendo de si lo encuentra
        boolean exist = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "Elias Profeta")
                .map(name -> new User(name.split(" ")[0],
                                             name.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(30))
                ;
        System.out.println(exist);

    }
}
