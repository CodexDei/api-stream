package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterSingleExample {

    public static void main(String[] args) {

        //ejemplo con usuario, buscando por apellido
        Stream<User> names = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "Elias Profeta")
                                    .map(name -> new User(name.split(" ")[0].toUpperCase(),
                                               name.split(" ")[1].toUpperCase()))
                                    .filter(u -> u.getApellido().equalsIgnoreCase("profetax"))
                                    ;
        Optional<User> user = names.findFirst();
        System.out.println(user.orElse(new User("Juan", "Bautista")).getNombre());
        System.out.println(user.orElseGet(() -> new User("Juan", "Bautista")).getNombre());
        if(user.isPresent()){
            System.out.println(user);

        }else {
            System.out.println("User not found");
        }


    }
}
