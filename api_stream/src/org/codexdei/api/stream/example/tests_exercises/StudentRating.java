package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRating {

    public static void main(String[] args) {

        /* Tienes un flujo de estudiantes con las propiedades nombre y calificación. Agrupa a los estudiantes en dos categorías:
            "Aprobados": calificación >= 3.0
            "Reprobados": calificación < 3.0 */

        List<Student> studentList = List.of(new Student("Pepe",3.0),
                            new Student("Jaime", 4.5),
                            new Student("Luis", 2.5),
                            new Student("Carla", 1.5));

        Map<String, List<Student>> studentGroup = studentList.stream()
                .collect(Collectors.groupingBy(student ->
                        student.getGrade() >= 3.0 ? "Passed" : "Failed"));

        System.out.println("Student Passed: " + studentGroup.get("Passed"));
        System.out.println("Student Failed: " + studentGroup.get("Failed"));
    }
}
