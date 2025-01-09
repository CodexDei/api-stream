package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.Transaction;
import org.codexdei.api.stream.example.models.User;
import org.codexdei.api.stream.example.models.product.CATEGORY;
import org.codexdei.api.stream.example.models.product.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionsStream {

    public static void main(String[] args) {

        /* Tienes una lista de transacciones realizadas por clientes. Cada transacción
        tiene el atributo cliente y un monto.Identifica los clientes que han realizado
        el mayor número de transacciones */

        List<Transaction> transactionList = Arrays.asList(new Transaction(new User("Pepe","Gonzalez"),
                                                   new Product("Mouse ThinkCentre", CATEGORY.ELETRONICS,10,3)),
                                                   new Transaction(new User("Susy","Samper"),
                                                   new Product("Adapter ThinkCentre", CATEGORY.ELETRONICS,50,2)),
                                                   new Transaction(new User("Pepe","Gonzalez"),
                                                   new Product("Smarphone Samsung A10", CATEGORY.ELETRONICS,120,1)));

        //Cuenta las transacciones
        Map<User,Long> transactionsCount = transactionList.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getUser,
                        Collectors.counting()
                ));
        transactionsCount.entrySet().stream()
                // Convierte el conjunto de entradas del mapa en un flujo.
                .sorted(
                        // Crea un comparador para ordenar por valor (número de transacciones).
                        Map.Entry.<User,Long>comparingByValue().reversed())
                // Recorre cada entrada y la imprime.
                .forEach(entry ->
                        System.out.println("User: " + entry.getKey() + " : " + entry.getValue()));

    }
}
