package org.codexdei.api.stream.example.tests_exercises;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sumStream {

    public static void main(String[] args) {

    /* El desafió consiste en un arreglo de 100 elementos del 1 al 100,
    del tipo int, utilizando el api stream se pide eliminar los divisibles
    en 10, luego convertir los elementos restante del flujo en tipo double
    y dividirlos en 2, para finalmente devolver la suma total de todos
    ellos usando el operador terminal reduce. El resultado debería ser
    2250.0*/

        double sum = IntStream.rangeClosed(1,100)
                     .filter(n -> n % 10 != 0)
                     .peek(System.out::println)
                     .asDoubleStream()
                     .map(n -> n/2)
                     .peek(System.out::println)
                     .reduce(0.0, Double::sum);

        System.out.println(sum);
    }
}
