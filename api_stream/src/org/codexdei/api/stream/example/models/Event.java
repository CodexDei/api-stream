package org.codexdei.api.stream.example.models;

import java.time.LocalDate;

public class Event {

    private LocalDate date;
    private String descriptionEvent;

    public Event(LocalDate date,String descriptionEvent){

        this.date = date;
        this.descriptionEvent = descriptionEvent;
    }

    public LocalDate getDate(){

        return this.date;
    }
    public String getDescriptionEvent(){
        return this.descriptionEvent;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
