package org.codexdei.api.stream.example.models;

public class Invoice {

    private String description;
    private User user;

    public Invoice(String description){

        this.description = description;
    }

    public String getDescription(){

        return this.description;
    }
    public void setDescription(String description){

        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
