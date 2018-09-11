package com.company;

public class Titular extends Profesor {
    //Atributos
    private String especialidad;


    //Constructor
    public Titular(String nombre, String apellido, Integer antiguedad, Integer codProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codProfesor);
        this.especialidad = especialidad;
    }

    //Getter

    public String getEspecialidad() {
        return especialidad;
    }
 }

