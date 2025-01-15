package org.codexdei.api.stream.example.models;

public class Proyect {

    private String idProyect;
    private double scoreProyect;

    public Proyect(String idProyect, double scoreProyect){

        this.idProyect = idProyect;
        this.scoreProyect = scoreProyect;
    }

    public String getIdProyect(){
        return this.idProyect;
    }
    public void setIdProyect(String idProyect){
        this.idProyect = idProyect;
    }

    public double getScoreProyect() {
        return scoreProyect;
    }

    public void setScoreProyect(double scoreProyect) {
        this.scoreProyect = scoreProyect;
    }

    @Override
    public String toString() {
        return "Proyect{" +
                "idProyect=" + idProyect +
                ", scoreProyect=" + scoreProyect +
                '}';
    }
}
