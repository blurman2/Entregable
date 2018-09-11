package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LectorDeArchivosCSV {
    //Atributos
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    //Getters
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    //Métodos
    public void leerArchivo(){

        String separador = ",";

        try {
            File archivo = new File("Auxiliares/listadoDeAlumnos.csv");
            FileReader fr = new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            String linea = br.readLine();
            linea = br.readLine(); //Esta línea es para saltearse el encabezado
            while (linea !=null){
               String[] campos = linea.split(separador);
               Integer codAlumno = Integer.parseInt(campos[0]);
               String nombre = campos[1];
               String apellido = campos[2];

               Alumno nuevoAlumno = new Alumno(nombre,apellido,codAlumno);
               this.listaAlumnos.add(nuevoAlumno);

               linea =br.readLine();
            }

        } catch (Exception e){
            System.out.println("No se pudo abrir el archivo");
        }
    }
}
