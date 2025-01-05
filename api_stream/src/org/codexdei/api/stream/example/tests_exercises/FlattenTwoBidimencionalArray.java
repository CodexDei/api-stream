package org.codexdei.api.stream.example.tests_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenTwoBidimencionalArray {

    public static void main(String[] args) {

        /* aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
           Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el
           arreglo de primer nivel.*/

        String[][] languages = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"},
                               {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        List<String> uniqueLanguage = Arrays.stream(languages)//convertimos el arreglo 2D en un stream
                .flatMap(Arrays::stream) //aplanamos los subarreglos en un solo flujo
                .distinct() //eliminamos duplicados
                .collect(Collectors.toUnmodifiableList())//recolectamos los datos en unas lista inmodificable
                ;
        uniqueLanguage.forEach(System.out::println);
    }
}
