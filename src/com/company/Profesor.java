package com.company;

public class Profesor {
    //Atributos
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codProfesor;

    //Constructor
    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codProfesor = codProfesor;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Integer getCodProfesor() {
        return codProfesor;
    }

    //Setters
    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    //Métodos
    @Override
    public boolean equals(Object obj) {
        Profesor otroProfesor = (Profesor) obj;
        if (this.getCodProfesor().equals(otroProfesor.getCodProfesor())) {
            return true;
        } else {
            return false;
        }
    }


}
