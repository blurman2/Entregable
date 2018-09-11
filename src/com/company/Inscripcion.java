package com.company;

import java.util.Date;

public class Inscripcion {
    //Atributos
    private Alumno alumno;
    private Curso curso;
    private Date fecha;

    //Constructor
   public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.fecha = new Date();
    }

    //Getters
    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getFecha() {
        return fecha;
    }
}
