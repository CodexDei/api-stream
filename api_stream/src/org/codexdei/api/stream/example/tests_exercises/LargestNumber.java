package org.codexdei.api.stream.example.tests_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LargestNumber {

    public static void main(String[] args) {

         /* El siguiente ejercicio es obtener el numero mayor de un arreglo pero
         utilizando programación funcional, implementando la expresión lambda
         Function<T,R> (que viene predefinida) con el api stream y operador
         reduce.
         */

        List<Integer> numbers = Arrays.asList(2,20,7,8,21,11,111);

        Function<List<Integer>,Integer> findNumber = n ->

            n.stream()
                    //puede cambiarse a min para hallar el menor o sum para sumarlos
                    .reduce(Integer::max)
                    .orElseThrow( () -> new IllegalArgumentException("list is empty"));
        ;

        int largestNumber = findNumber.apply(numbers);

        System.out.println(largestNumber);
    }
}
