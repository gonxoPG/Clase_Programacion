package controller;

import model.Alumno;

import java.util.ArrayList;

public class Colegio {
    private ArrayList<Alumno> listadoAlumnos;
    private int contador = 0000;

    public Colegio() {
        listadoAlumnos = new ArrayList<>();
    }

    public void listarAlumnos(){
        for (Alumno item : listadoAlumnos){
            item.mostrarDatos();
        }
    }

    public void darAlta(Alumno alumno){
        contador++;
        listadoAlumnos.add(alumno);
        alumno.setMatricula(contador);
    }

    public void calificarAlumno(int matricula, double nota){
        for (Alumno item : listadoAlumnos){
            if (matricula == item.getMatricula()){
                item.setCalificacion(nota);
            }
        }
    }
//-------------------------------------------------------------------------
    public ArrayList<Alumno> getListadoAlumnos() {
        return listadoAlumnos;
    }

    public void setListadoAlumnos(ArrayList<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }
}
