package com.company;

import java.util.ArrayList;

public class Curso {
    //Atributos
    private String nombre;
    private Integer codCurso;
    private Titular profeTitular;
    private Adjunto profeAdjunto;
    private ArrayList<Alumno> alumnosInscriptos;
    private Integer cupo;

    //Constructor
    public Curso(String nombre, Integer codCurso, Titular profeTitular, Adjunto profeAdjunto, Integer cupo) {
        this.nombre = nombre;
        this.codCurso = codCurso;
        this.profeTitular = profeTitular;
        this.profeAdjunto = profeAdjunto;
        this.cupo = cupo;
        this.alumnosInscriptos = new ArrayList<>();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public Titular getProfeTitular() {
        return profeTitular;
    }

    public Adjunto getProfeAdjunto() {
        return profeAdjunto;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public Integer getCupo() {
        return cupo;
    }

    //Setter


    public void setProfeTitular(Titular profeTitular) {
        this.profeTitular = profeTitular;
    }

    public void setProfeAdjunto(Adjunto profeAdjunto) {
        this.profeAdjunto = profeAdjunto;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    //Métodos
    @Override
    public boolean equals(Object obj){
        Curso otroCurso = (Curso) obj;
        if (this.getCodCurso().equals(otroCurso.getCodCurso())){
            return true;
        } else{
            return false;
        }
    }

    public boolean agregarUnAlumno(Alumno unAlumno){

        if (this.cupo > alumnosInscriptos.size()){
            this.alumnosInscriptos.add(unAlumno);
            return true;
        } else {
            return false;
        }
    }

    public void eliminarUnAlumno(Alumno unAlumno){
        for (Alumno a: alumnosInscriptos
             ) {if (a.equals(unAlumno)){
                 alumnosInscriptos.remove(a);
                 System.out.println("El alumno "+ a.getNombre() + " " + a.getApellido()+ " se eliminó correctamente del curso " + this.getNombre());
                 return;
        }
        }
        System.out.println("No se encontró el alumno");
        return;
    }

}
