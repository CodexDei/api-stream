package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListToStreamExample {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User("Ester", "Reina"));
        userList.add(new User("Ruth", "Moabita"));
        userList.add(new User("Maria", "Pura"));
        userList.add(new User("Elizabeth", "Bendecida"));
        userList.add(new User("Lea", "Fe"));
        userList.add(new User("Maria", "Magdalena"));
        userList.add(new User("Maria", "Fe"));

        Stream<String> names = userList.stream()
                .map(user -> user.getName().toUpperCase()
                .concat(" ")
                .concat(user.getLastName().toUpperCase()))
                .flatMap(name ->{
                    if (name.contains("Maria".toUpperCase())){

                        return Stream.of(name);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println)
                ;
        System.out.println(names.count());;

    }
}
