package com.company;

import java.util.ArrayList;
// 1. Crear una clase Main y un método main.
public class Main {

    public static void main(String[] args) {
        // write your code here

        //----- Pruebas sobre la clase DigitalHouseManager---Parte J del Entegable------------------------------------------------------
        DigitalHouseManager dhm = new DigitalHouseManager();

        //2. Dar de alta dos profesores titulares y dos profesores adjuntos. (Inventar todos sus valores)
        dhm.altaProfesorTitular("Marie", "Curie",1001,"Física y Química");
        dhm.altaProfesorTitular("Hedy", "Lamarr",1002, "Telecomunicaciones");

        dhm.altaProfesorAdjunto("Evelyn","Berezin", 1003,9);
        dhm.altaProfesorAdjunto("Grace", "Murray",1004,16);

        //3. Dar de alta dos cursos.
        dhm.altaCurso("Full Stack",20001,3);
        dhm.altaCurso("Android", 20002,2);

        //4. Asignarle un profesor titular y un adjunto a cada curso
        dhm.asignarProfesores(20001,1001,1003);
        dhm.asignarProfesores(20002,1002,1004);


        //5. Dar de alta a tres alumnos. (Inventar todos sus valores)
        dhm.altaAlumno("Ernesto", "Martinez", 102);
        dhm.altaAlumno("Angela", "Müller",103);
        dhm.altaAlumno("Pipi", "Longstocking", 104);

        //6. Inscribir a dos alumnos en el curso de Full Stack.
        dhm.inscribirAlumno(103,20001);
        dhm.inscribirAlumno(104,20001);
        //7. Inscribir a tres alumnos en el curso de Android.
        dhm.inscribirAlumno(102,20002);
        dhm.inscribirAlumno(103,20002);
        dhm.inscribirAlumno(104,20002);

        //8. Dar de baja un profesor
        dhm.bajaProfesor(1004);

        //9. Dar de baja un curso
        dhm.bajaCurso(20001);
    }
}
/* Parte K: 1. ¿Cómo modificaría el diagrama de clases para que se le pueda consultar a un alumno a qué
cursos está inscripto?

Agregaría en la clase Alumno, un atributo que consista en una lista del tipo Curso, que contenga todos los cursos en
los cuales el alumno está inscripto.
*/