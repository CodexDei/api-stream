package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.Event;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventStream {

    public static void main(String[] args) {

        /* Dado un flujo de eventos con los atributos descripción y fechaCreación,
        encuentra los tres eventos más recientes que aún están pendientes */

        List<Event> eventsList = Arrays.asList(new Event(LocalDate.of(2024,12,20),"HappyBirthday Samy"),
                                               new Event(LocalDate.of(2024,12,25),"meeting family Husban"),
                                               new Event(LocalDate.of(2024,12,31),"meeting family wife"),
                                               new Event(LocalDate.of(2025,01,8),"HappyBirthday Jhon"),
                                               new Event(LocalDate.of(2025,01,24),"HappyBirthday Marye"));

        List<Event> top3Events =  eventsList.stream()
                .sorted(Comparator.comparing(Event::getDate).reversed())
                .limit(3)
                .collect(Collectors.toUnmodifiableList());

        top3Events.forEach(event -> System.out.println(event.getDate()));
    }
}
