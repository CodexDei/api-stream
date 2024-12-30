package org.codexdei.api.stream.example.models;

public class User {

    private String nombre;
    private String apellido;
    private Integer id;
    private static int lastId = 0;

    public User(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++lastId;
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

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}