package com.company;

public class Alumno {
    //Atributos
    private String nombre;
    private String apellido;
    private Integer codAlumno;

    //Constructor
    public Alumno(String nombre, String apellido, Integer codAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codAlumno = codAlumno;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodAlumno() {
        return codAlumno;
    }

    //Métodos
    @Override
    public boolean equals(Object obj){
        Alumno otroAlumno = (Alumno) obj;
        if (this.getCodAlumno().equals(otroAlumno.getCodAlumno())){
            return true;
        } else {
            return false;
        }
    }
}
