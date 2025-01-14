package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Abraham", "Isaac", "Jacob")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                ;
        //names.forEach(System.out::println);

        List<String> list = names.collect(Collectors.toUnmodifiableList());
        list.forEach(System.out::println);

        //ejemplo con usuario
        Stream<User> userStream = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose")
                                    .map(name -> new User(name.split(" ")[0].toUpperCase(),
                                               name.split(" ")[1].toUpperCase()))
                                    .peek(System.out::println)
                                    .map(user -> {
                                        String name = user.getName().toLowerCase();
                                        user.setName(name);
                                        return user;
                                    });

        List<User> userList = userStream.collect(Collectors.toList());
        userList.forEach(System.out::println);

    }
}
