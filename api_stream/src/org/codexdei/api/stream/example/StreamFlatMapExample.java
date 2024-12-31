package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapExample {

    public static void main(String[] args) {

        Stream<User> userStream = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "Elias Profeta")
                                    .map(name -> new User(name.split(" ")[0].toUpperCase(),
                                               name.split(" ")[1].toUpperCase()))
                                    .flatMap(u -> {
                                        if (u.getApellido().equalsIgnoreCase("profetax")){
                                            return Stream.of(u);
                                        }
                                        return Stream.empty();
                                    })
                                    ;
        List<User> userList = userStream.collect(Collectors.toList());
        userList.forEach(System.out::println);
    }
}
