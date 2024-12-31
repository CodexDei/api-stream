package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamDistinctUserExample {

    public static void main(String[] args) {

        //ejemplo con usuario, buscando por apellido
        Stream<User> names = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "David Rey","Elias Profeta")
                //Si el objeto no tiene definido el equals y hascode se debe colocar el distinct antes del map
                                    .map(name -> new User(name.split(" ")[0].toUpperCase(),
                                               name.split(" ")[1].toUpperCase()))
                                    .distinct()
                                    ;
        names.forEach(System.out::println);
    }
}
