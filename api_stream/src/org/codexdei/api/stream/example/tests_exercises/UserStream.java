package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserStream {

    public static void main(String[] args) {

        /* Tienes una lista de usuarios con nombres y apellidos.
        Filtra aquellos cuyos nombres empiezan con la letra "J" y convierte
        sus nombres a mayúsculas. Devuelve la lista de nombres transformados.*/
        List<String> usersList = Arrays.asList(new User("Pepe", "Casas"),
                                             new User("Jacinto","Jaimes"),
                                             new User("Andrea","Jimenez"),
                                             new User("Jorge","Navarro"))
                                            .stream().filter(User -> User.getName().startsWith("J"))
                                            .map(User -> User.getName().toUpperCase())
                                            .collect(Collectors.toUnmodifiableList());
        usersList.forEach(System.out::println);


    }
}
