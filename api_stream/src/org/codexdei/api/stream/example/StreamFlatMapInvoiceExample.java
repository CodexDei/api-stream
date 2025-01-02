package org.codexdei.api.stream.example;

import org.codexdei.api.stream.example.models.Invoice;
import org.codexdei.api.stream.example.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapInvoiceExample {

    public static void main(String[] args) {

       User user1 = new User("Oscar", "Castillo");
       User user2 = new User("Jazmin", "Acosta");

       user1.addInvoice(new Invoice("Purchase a laptop lenovo"));
       user1.addInvoice(new Invoice("Purchase a bicycle"));

       user2.addInvoice(new Invoice("Purchase a notebook"));
       user2.addInvoice(new Invoice("Purchase a tablet fire"));

       List<User>   users = Arrays.asList(user1,user2);

       users.stream()
               .flatMap(u -> u.getInvoices().stream())
               .forEach(f -> System.out.println(f.getDescription()
                       .concat(": Cliente ").concat(f.getUser().toString())))
                ;
    }
}
