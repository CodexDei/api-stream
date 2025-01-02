package org.codexdei.api.stream.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String nombre;
    private String apellido;
    private Integer id;
    private static int lastId = 0;
    //agregar facturas
    private List<Invoice> invoices;

    public User(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++lastId;
        this.invoices = new ArrayList<>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return Objects.equals(nombre, user.nombre) && Objects.equals(apellido, user.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
