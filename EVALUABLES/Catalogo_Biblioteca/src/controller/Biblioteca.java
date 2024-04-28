package controller;

import lombok.Getter;
import lombok.Setter;
import utils.HuecoInsuficienteException;
import utils.NoHayLibroException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public abstract class Biblioteca {
    Scanner teclado = new Scanner(System.in);

    private String nombre, director;
    private Catalogo catalogo;
    private ArrayList<Libro> contenedorLibros;
    private ArrayList<Usuario> registroUsuarios;

    public Biblioteca() {
        contenedorLibros = new ArrayList<>();
    }

    public void nuevoUsuario(String nombre, String apellidos, String DNI) {
        registroUsuarios = new ArrayList<>();
        registroUsuarios.add(new Usuario(nombre, apellidos, DNI));
        System.out.println("Nuevo usuario registrado correctamente\n");
    }

    public void buscarLibro(int ISBN) throws NoHayLibroException {
        try {
            boolean encontrado = false;

            for (Libro item : catalogo.getCatalogo()) {
                if (item.getISBN() == ISBN) {
                    encontrado = true;
                    item.mostrarDatos(ISBN);
                    break;
                }
            }

            if (!encontrado) {
                throw new NoHayLibroException("El libro indicado no se ha encontrado");
            }

        } catch (NullPointerException e) { // se podría tratar de forma más genérica la RuntimeException
            System.out.println("El catálogo no existe");
        }
    }

    public void agregarLibro(Libro libro) throws HuecoInsuficienteException {
        contenedorLibros.add(libro);

        try {
            if (catalogo.estaLibro(libro.getISBN())) {
                System.out.printf("El libro ya está en el catálogo y no se puede duplicar");
            } else if ((catalogo.capacidad - catalogo.getCatalogo().size()) <= 0) {
                throw new HuecoInsuficienteException("El catálogo no tiene suficiente capacidad\n");
            } else {
                catalogo.catalogoArray.add(libro);
                System.out.println("Libro agregado correctamente\n");
            }
        } catch (NullPointerException e) { // se podría tratar de forma más genérica la RuntimeException
            System.out.println("El catálogo no existe\n");
        }
    }

    public void sacarLibro(int ISBN) {
        for (Libro item : catalogo.getCatalogo()) {
            if (catalogo.estaLibro(ISBN)) {
                catalogo.getCatalogo().remove(item);
                contenedorLibros.remove(item);
                System.out.println("Libro eliminado correctamente\n");
                break;
            } else {
                System.out.println("El libro no se puede eliminar del catálogo porque no está");
            }
        }
    }

    public void construirCatalogo(int numeroLibros) {
        this.catalogo = new Catalogo(numeroLibros);
        System.out.println("Catálogo construido correctamente 📒\n");
    }

    public void numLibrosCatalogo() {
        System.out.println("La cantidad de libros que tiene este catálogo son " + catalogo.getCatalogo().size());
    }

    public void mostrarCatalogo() {
        System.out.println("Los libros que estan en el catálogo de la biblioteca son:\n");
        for (Libro item : catalogo.getCatalogo()) {
            int itemISBN = item.getISBN();
            item.mostrarDatos(item.getISBN());
        }
    }

    public void exportarLibrosCatalogo(){
        File file = new File("src/resource/Libros.obj");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(catalogo.getCatalogo());
            System.out.println("Los libros han sido exportados correctamente");
        } catch (IOException e) {
            System.out.println("Error en la exportación del objeto");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            } catch (NullPointerException e){
                System.out.println("Cerrado en nulo");
            }
        }
    }

    class Catalogo {

        private ArrayList<Libro> catalogoArray;
        private int capacidad;

        public Catalogo() {
            catalogoArray = new ArrayList<>();
        }

        public Catalogo(int capacidad) {
            catalogoArray = new ArrayList<>();
            this.capacidad = capacidad;
        }

        public boolean estaLibro(int ISBN) {
            for (Libro item : catalogoArray) {
                if (ISBN == item.getISBN()) {
                    return true;
                }
            }
            return false;
        }

        public ArrayList<Libro> getCatalogo() {
            return catalogoArray;
        }
    }
}
