package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.Proyect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProyectStream {

    public static void main(String[] args) {

        /* Tienes un flujo de evaluaciones de proyectos donde cada evaluación tiene un proyectoId y un puntaje.
        Calcula la media de los puntajes para cada proyecto y genera un Map con el proyectoId como clave y la
        media como valor. */

        List<Proyect> proyectList = Arrays.asList(new Proyect("P1",7),new Proyect("P2",5),
                                                new Proyect("P1",2),new Proyect("P2",8.5));

        Map<String,Double> avarageProyect = proyectList.stream()
                .collect(Collectors.groupingBy(
                        Proyect::getIdProyect,
                        Collectors.averagingDouble(Proyect::getScoreProyect)
                ));

        avarageProyect.forEach( (idproyect, avarage) ->
                System.out.println("The avarage proyect " + idproyect + " es:" + avarage));

    }
}
