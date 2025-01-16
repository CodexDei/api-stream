package org.codexdei.api.stream.example.tests_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberCombination {

    public static void main(String[] args) {

        /* Tienes dos listas de números enteros: lista1 y lista2.

            Encuentra todas las combinaciones únicas (a, b) donde a pertenece a lista1 y b a lista2,
        y la suma de a y b es un número primo.

        Devuelve el resultado como una lista de cadenas en el formato "a+b=c". */

        // Lista A con 20 números enteros del 1 al 40
        List<Integer> listA = Arrays.asList( 5, 7, 8, 1, 12, 14, 3, 16, 18,
           2, 19, 4, 9, 10, 11, 13, 15, 17, 6, 20 );
        // Lista B con 20 números enteros del 1 al 40, incluyendo solo 10
        // de la lista A
        List<Integer> listB = Arrays.asList( 15, 3, 8, 1, 6, 4, 2, 18, 7,
                10, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 );

        List<String> listPrimeNumbers = listA.stream()
                .flatMap(a -> listB.stream()
                        .filter(b -> isPrimo(a + b))
                        .map(b -> a + " + " + b + " = " + (a + b))
                )
                .collect(Collectors.toList());

        listPrimeNumbers.forEach(System.out::println);
    }

    private static boolean isPrimo(int num) {

        if(num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++){

            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
