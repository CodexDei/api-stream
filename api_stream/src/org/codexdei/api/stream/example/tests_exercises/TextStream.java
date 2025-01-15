package org.codexdei.api.stream.example.tests_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextStream {

    public static void main(String[] args) {

        /* Tienes un flujo de cadenas que representan líneas de texto de un libro.
           Encuentra las cinco palabras más comunes en el texto, ignorando las palabras de
           menos de tres letras. */

        String text =   "En una tranquila noche de verano, el pequeño pueblo de Villanueva fue testigo " +
                "de un evento que cambiaría la vida de sus habitantes para siempre. Una nave espacial" +
                " apareció en el cielo, iluminando la oscuridad con un resplandor azul eléctrico. Los" +
                " curiosos aldeanos se acercaron al lugar del aterrizaje, donde se encontraron con seres" +
                " extraterrestres de piel luminosa y ojos profundos que transmitían sabiduría y paz. En un " +
                "lenguaje musical y armonioso, los visitantes compartieron mensajes de unidad y esperanza," +
                " dejando a los humanos con la promesa de un futuro intergaláctico donde todas las especies" +
                " convivirían en armonía y aprendizaje mutuo. El recuerdo de esa noche quedó grabado en los " +
                "corazones de los habitantes, quienes empezaron a ver el universo con una nueva perspectiva";

        // Procesar y contar palabras
        Map<String, Long> wordFrequency = Arrays.stream(
                        text.toLowerCase().replaceAll("[^a-záéíóúñü ]", "").split("\\s+"))
                .filter(word -> word.length() >= 3)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Ordenar por frecuencia descendente
        List<Map.Entry<String, Long>> topWords = wordFrequency.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(5) // Tomar las 5 palabras más comunes
                .collect(Collectors.toList());

        // Mostrar las palabras más comunes con su frecuencia
        System.out.println("Palabras más comunes:");
        topWords.forEach(entry ->
                System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " + entry.getValue()));
    }
}
