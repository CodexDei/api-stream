package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.stream.Stream;

public class StreamFilterSingle2Example {

    public static void main(String[] args) {

        //ejemplo con usuario, buscando por apellido
        User user = Stream
                .of("Eliseo Profeta", "David Rey", "Maria DeJose", "Elias Profeta")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(5))
                .findFirst().orElseGet( () -> new User("Oseas", "Profeta"))
                ;
        //Muestra el resultado de la busqueda, sino esta mostrara el "orElseGet"
        System.out.println(user);

    }
}
