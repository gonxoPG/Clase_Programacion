package model;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    public Agenda() {
        listaPersonas = new ArrayList<>();
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void agregarPersona(Persona persona){

        //esto es un filtro de comprobación de la existencia antes de agregar
        if (comprobarPersona(persona.getDNI())==null){
        this.listaPersonas.add(persona);
            System.out.println(persona.getNombre()+" "+persona.getApellido()+" ha sido agreado correctamente");
        } else {
            System.out.println("El usuario ya se encuentra en la lista");
        }
    }

    public void mostrarPersonasAgenda(){
        for (Persona persona : listaPersonas){
            persona.mostrarDatos();
        }
    }

    public void borrarPersona(String DNI){
        if(comprobarPersona(DNI)==null){
            System.out.println("Esta persona no se encuentra en la agenda");
        }else{
            listaPersonas.remove(comprobarPersona(DNI));
            System.out.println("Persona borrada correctamente");
        }
    }

    //se crea este método para poder ejecutarlo en el filtro antes de agregar una nueva persona
    private Persona comprobarPersona(String DNI){
        for (Persona item : listaPersonas)
            if (item.getDNI().equals(DNI)){
                return item;
            }
        return null;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}
