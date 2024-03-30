package controller;

import model.Elemento;
import model.Persona;
import model.Video;

import java.util.ArrayList;

public class Coleccion {
    ArrayList<Elemento> listaElementos;

    public Coleccion() {
        listaElementos = new ArrayList<>();
    }

    //AÑADIR ELEMENTO AL ARRAY
    public void anadirElementos(Elemento elemento) {
        listaElementos.add(elemento);
        System.out.println("El elemento se ha añadido correctamente");
    }

    //MOSTRAR DATOS ARRAY
    public void listarElementos() {
        for (Elemento item : listaElementos) {
            item.mostrarDatos();
        }
    }

    //BÚSQUEDA EN ARRAY
    public void buscarElemento(int id) {
        for (Elemento item : listaElementos) {
            if (item.getId() == id) {
                System.out.println("Elemento encontrado");
                item.mostrarDatos();
                break; // si quiero que se detenga; si no, continúa buscando más resultados
            }
        }
    }

    //ELIMINAR ELEMENTO ARRAY
    public void eliminarElemento(int id) {
        for (Elemento item : listaElementos) {
            if (item.getId() == id) {
                listaElementos.remove(item);
                System.out.println("Elemento eliminado");
                break;
            }
        }
    }

    public void buscarDirector(String nombre) {
        for (Elemento item : listaElementos) {
            if (item instanceof Video) {
                if (((Video) item).getDirector().getNombre().equalsIgnoreCase(nombre)) {
                    item.mostrarDatos();
                    break;
                }
            }
        }
    }

    public void buscarActor(String nombre) {
        for (Elemento item : listaElementos) {
            if (item instanceof Video) {
                for (Persona actor : ((Video) item).getActores()) {
                    if (actor.getNombre().equalsIgnoreCase(nombre)) {
                        actor.mostrarDatos();
                        break;
                    }
                }
            }
        }
    }


    public void buscarAutor(String nombre) {
        for (Elemento item : listaElementos) {
            if (item.getAutor().getNombre().equalsIgnoreCase(nombre)) {
                item.mostrarDatos();
                break;
            }
        }
    }
}
