package com.company;

public class Adjunto extends Profesor {
    //Atributos
    private Integer cantHoras;

    //Constructor
    public Adjunto(String nombre, String apellido, Integer antiguedad, Integer codProfesor, Integer cantHoras) {
        super(nombre, apellido, antiguedad, codProfesor);
        this.cantHoras = cantHoras;
    }
    //Getters y Setters
    public Integer getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(Integer cantHoras) {
        this.cantHoras = cantHoras;
    }
}
