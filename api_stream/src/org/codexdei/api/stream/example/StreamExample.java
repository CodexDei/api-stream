package org.codexdei.api.stream.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Maryi", "Samy", "George","Jey", "Melvin", "Joha");
        names.forEach(System.out::println);

        String[] lastNames = {"Hortua", "Aguilera", "Garcia", "Cayama", "Oyola"};
        Stream<String> lastNamesStream = Arrays.stream(lastNames);
        lastNamesStream.forEach(System.out::println);

        Stream<String> nickNames = Stream.<String>builder()
                .add("Chuchis")
                .add("Chiqui")
                .add("Rigo")
                .build();
        nickNames.forEach(System.out::println);

        //De list a Stream
        List<String> listNames = new ArrayList<>();
        listNames.add("Richard");
        listNames.add("Eduardo");
        listNames.add("David");

        Stream namesStream = listNames.stream();
        namesStream.forEach(System.out::println);
        //otra forma mas rapida sin crear el Stream
        listNames.stream().forEach(System.out::println);


    }
}
