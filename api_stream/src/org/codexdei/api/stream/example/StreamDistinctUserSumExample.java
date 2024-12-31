package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDistinctUserSumExample {

    public static void main(String[] args) {

        //ejemplo con usuario, buscando por apellido
        IntStream users = Stream.of("Eliseo Profeta", "David Rey", "Maria DeJose", "Elias Profeta")
                //Si el objeto no tiene definido el equals y hascode se debe colocar el distinct antes del map
                                    .map(name -> new User(name.split(" ")[0].toUpperCase(),
                                               name.split(" ")[1].toUpperCase()))
                                    .distinct()
                .peek(System.out::println)
                //Genera el tamaño de caracteres de cada objeto(se tiene que tener implementado el toString)
                //Se coloca menos 1 porque el toString tiene implementado un espacio entre el nombre y apellido por
                //lo que hay que restarselo
                                    .mapToInt(u -> (u.toString().length()-1))
                                    .peek(System.out::println)
                                    ;
        IntSummaryStatistics statistics = users.summaryStatistics();
        System.out.println("Min:" + statistics.getMin());
        System.out.println("Max:" + statistics.getMax());
        System.out.println("Sum:" + statistics.getSum());
        System.out.println("Average:" + statistics.getAverage());
        System.out.println("Count:" + statistics.getCount());
    }
}
