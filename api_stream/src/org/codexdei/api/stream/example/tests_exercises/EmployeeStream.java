package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {

        /* Tienes una lista de empleados con las siguientes propiedades: nombre, departamento y salario.

        Reto:

        Agrupa a los empleados por departamento.
        Dentro de cada departamento, ordena a los empleados por salario de forma descendente.
        Devuelve un mapa donde la clave sea el nombre del departamento y el valor sea una lista
        de nombres de los empleados ordenados. */

      List<Employee> employees = Arrays.asList(

              new Employee("Alice", "Human Resources", 50000),
              new Employee("Bob", "Marketing", 55000),
              new Employee("Charlie", "Human Resources", 52000),
              new Employee("David", "IT", 60000),
              new Employee("Eve", "Sales", 58000),
              new Employee("Frank", "Marketing", 53000),
              new Employee("Grace", "IT", 62000),
              new Employee("Heidi", "Sales", 54000),
              new Employee("Ivan", "Finance", 57000),
              new Employee("Judy", "Finance", 59000) );

        Map<String, List<String>> employeeDepartamentSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartament,
                        Collectors.collectingAndThen(
                                Collectors.toList(), list ->
                                list.stream()
                                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                    .map(Employee::getName)
                                    .collect(Collectors.toList())
                        )

        ));

        employeeDepartamentSalary.forEach( (departament, listNames) -> {

            System.out.println("Departament order by salary: " + departament);
            listNames.forEach(System.out::println);
        });






    }
}
