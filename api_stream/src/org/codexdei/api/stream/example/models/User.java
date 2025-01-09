package org.codexdei.api.stream.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String lastName;
    private Integer id;
    private static int lastId = 0;
    //agregar facturas
    private List<Invoice> invoices;

    public User(String nombre, String apellido){

        this.name = nombre;
        this.lastName = apellido;
        this.id = ++lastId;
        this.invoices = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
        invoice.setUser(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
