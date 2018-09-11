package com.company;

import java.util.ArrayList;

public class DigitalHouseManager {
    //Atributos
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();

    //Getters
    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    //Métodos
    public void altaCurso(String nombre, Integer codCurso, Integer cupo){
        Curso nuevoCurso = new Curso(nombre,codCurso, null, null,cupo);
        this.listaCursos.add(nuevoCurso);
        System.out.println("El curso "+ nuevoCurso.getNombre()+" se dio de alta exitósamente");
    }

    public void bajaCurso(Integer codCurso){
        for (Curso c: listaCursos
             ) { if (c.getCodCurso().equals(codCurso)){
                 listaCursos.remove(c);
                 System.out.println("El curso "+c.getNombre()+" se elimnó correctamente");
                 return;
                }
        }
        System.out.println("No se encontró curso con el código " + codCurso);
        return;
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codProfesor, Integer cantHoras){
        Adjunto nuevoProfeAdjunto = new Adjunto(nombre, apellido,0,codProfesor, cantHoras);
        this.listaProfesores.add(nuevoProfeAdjunto);
        System.out.println("El profesor adjunto " + nuevoProfeAdjunto.getNombre() + " " + nuevoProfeAdjunto.getApellido()+ " se dio de alta exitósamente");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codProfesor, String especialidad){
        Titular nuevoProfeTitular = new Titular(nombre, apellido,0,codProfesor,especialidad);
        this.listaProfesores.add(nuevoProfeTitular);
        System.out.println("El profesor titular " + nuevoProfeTitular.getNombre() + " " + nuevoProfeTitular.getApellido()+ " se dio de alta exitósamente");
    }

    public void bajaProfesor(Integer codProfesor){
        for (Profesor p:listaProfesores
             ) { if (p.getCodProfesor().equals(codProfesor)){
                listaProfesores.remove(p);
                System.out.println("El profesor "+ p.getNombre()+ " " + p.getApellido()+" se dio de baja correctamente");
                return;
               }
        }
        System.out.println("No se encontró profesor con el código " + codProfesor);
        return;
    }

    public void altaAlumno(String nombre, String apellido, Integer codAlumno){
        Alumno nuevoAlumno = new Alumno(nombre, apellido, codAlumno);
        this.listaAlumnos.add(nuevoAlumno);
        System.out.println("El alumno "+ nuevoAlumno.getNombre()+ " " + nuevoAlumno.getApellido()+ " se dio de alta exitósamente");
    }

    public void inscribirAlumno(Integer codAlumno, Integer codCurso) {
        Alumno alumnoAInscribir = null;
        Curso cursoAInscribirse = null;

        for (Alumno a : listaAlumnos
        ) {
            if (a.getCodAlumno().equals(codAlumno)) {
                alumnoAInscribir = a;
            }
        }

        for (Curso c : listaCursos
        ) {
            if (c.getCodCurso().equals(codCurso)) {
                cursoAInscribirse = c;
            }
        }

        if ((alumnoAInscribir != null) && (cursoAInscribirse != null)) {
            if (cursoAInscribirse.agregarUnAlumno(alumnoAInscribir)) {
                Inscripcion inscripcion = new Inscripcion(alumnoAInscribir, cursoAInscribirse);
                this.listaInscripciones.add(inscripcion);
                System.out.println("El alumno " + alumnoAInscribir.getNombre() + " " + alumnoAInscribir.getApellido() + " se ha inscripto correctamente al curso " + cursoAInscribirse.getNombre());
            } else {
                System.out.println("El alumno " + alumnoAInscribir.getNombre() + " " + alumnoAInscribir.getApellido() + " NO TIENE CUPO para inscribirse al curso " + cursoAInscribirse.getNombre());
            }
        } else if (alumnoAInscribir == null) {
            System.out.println("No se encontró alumno con el código " + codAlumno);
        } else {
            System.out.println("No se encontró curso con el código " + codCurso);
        }
    }

    public void asignarProfesores(Integer codCurso, Integer codProfeTitular, Integer codProfeAdjunto) {
        Titular profeTitular = null;
        Adjunto profeAdjunto = null;

        for (Profesor p : listaProfesores
        ) {
            if (p.getCodProfesor().equals(codProfeTitular)) {
                try {
                    profeTitular = (Titular) p;
                } catch (Exception e){
                    System.out.println("El código ingresado corresponde a un profesor que NO es titular");
                    return;
                }
            }
        }

        for (Profesor p : listaProfesores
        ) {
            if (p.getCodProfesor().equals(codProfeAdjunto)) {
                try {
                    profeAdjunto = (Adjunto) p;
                } catch (Exception e){
                    System.out.println("El código ingresado corresponde a un profesor que NO es adjunto");
                    return;
                }
            }
        }

        if ((profeTitular != null) && (profeAdjunto != null)) {

            for (Curso c : listaCursos
            ) {
                if (c.getCodCurso().equals(codCurso)) {
                    c.setProfeTitular(profeTitular);
                    c.setProfeAdjunto(profeAdjunto);
                    System.out.println("Se asignó al curso " + c.getNombre() + " el profesor titular " + profeTitular.getNombre() + " " + profeTitular.getApellido() + " y el profesor adjunto " + profeAdjunto.getNombre() + " " + profeAdjunto.getApellido());
                    return;
                }
            }
            System.out.println("No se encontró curso con el código " + codCurso);
            return;
        } else if (profeTitular == null) {
            System.out.println("No se encontró profesor titular con el código " + codProfeTitular);
        } else {
            System.out.println("No se encontró profesor adjunto con el código " + codProfeAdjunto);
        }
    }
}
