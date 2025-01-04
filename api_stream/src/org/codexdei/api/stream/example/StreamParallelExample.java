package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamParallelExample {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User("Ester", "Reina"));
        userList.add(new User("Ruth", "Moabita"));
        userList.add(new User("Maria", "Pura"));
        userList.add(new User("Elizabeth", "Bendecida"));
        userList.add(new User("Lea", "Fe"));
        userList.add(new User("Maria", "Magdalena"));
        userList.add(new User("Maria", "Fe"));

        long t1 = System.currentTimeMillis();

        String result = userList.stream()
                .map(user -> user.toString())
                //parallel ejecuta con un pool de Threads, lo que hace que
                //Procese mas rapido
                .parallel()
                .peek(n ->{
                    System.out.println("Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(name ->{

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (name.contains("Maria".toUpperCase())){

                        return Stream.of(name);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("")
                ;
        long t2 = System.currentTimeMillis();

        System.out.println("Time: " + (t2-t1));;

    }
}
