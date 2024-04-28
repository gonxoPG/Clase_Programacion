package model;

import controller.Biblioteca;
import controller.Libro;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public final class BibliotecaEspecializada extends Biblioteca {

    private BibliotecaTerror bibliotecaTerror;
    private BibliotecaComedia bibliotecaComedia;
    private BibliotecaPoliciaca bibliotecaPoliciaca;
    private BibliotecaEnsayo bibliotecaEnsayo;

    //mostrarDatos con parámetro de selección del género de la biblioteca (switch)
    //Hará falta un sout en el main pidiendo "temática"

    public void mostrarDatos(String tematica){

        switch (tematica.toLowerCase()){
            case "terror":
                bibliotecaTerror.mostrarLibrosTerror();
                break;

            case "comedia":
                bibliotecaComedia.mostrarLibrosComedia();
                break;

            case "policiaca":
                bibliotecaPoliciaca.mostrarLibrosPoliciaca();
                break;

            case "ensayo":
                bibliotecaEnsayo.mostrarLibrosEnsayo();
                break;

            default:
                System.out.println("La temática introducida no coincide con ninguna biblioteca");
            }
    }

    class BibliotecaTerror {
        // recorrer el catalogo y extraer solo los libros del terror y mostrarlos

        private ArrayList<LibroTerror> estanteLibrosTerror;

        public void mostrarLibrosTerror() {
            estanteLibrosTerror = new ArrayList<>();

            for (Libro item : getContenedorLibros()) {
                if (item instanceof LibroTerror) {
                    estanteLibrosTerror.add((LibroTerror) item);
                }
            }

            System.out.println("Los libros que están en la biblioteca de Terror son:");
            for (LibroTerror item : estanteLibrosTerror) {
                System.out.println(item);
            }
        }

    }

    class BibliotecaComedia {
        // recorrer el catalogo y extraer solo los libros del comedia y mostrarlos
        private ArrayList<LibroComedia> estanteLibrosComedia;

        public void mostrarLibrosComedia(){
            estanteLibrosComedia = new ArrayList<>();

            for (Libro item : getContenedorLibros()){
                if (item instanceof LibroComedia){
                    estanteLibrosComedia.add((LibroComedia) item);
                }
            }

            System.out.println("Los libros que están en la biblioteca de Comedia son:");
            for (LibroComedia item : estanteLibrosComedia){
                System.out.println(item);
            }
        }
    }

    class BibliotecaPoliciaca {
        // recorrer el catalogo y extraer solo los libros del policiaca y mostrarlos

        private ArrayList<LibroPoliciaca> estanteLibrosPoliciaca;

        public void mostrarLibrosPoliciaca(){
            for (Libro item : getContenedorLibros()){
                if (item instanceof LibroPoliciaca){
                    estanteLibrosPoliciaca.add((LibroPoliciaca) item);
                }
            }

            System.out.println("Los libros que están en la biblioteca de Policíacas son:");
            for (LibroPoliciaca item : estanteLibrosPoliciaca){
                System.out.println(item);
            }
        }
    }

    class BibliotecaEnsayo {
        // recorrer el catalogo y extraer solo los libros del ensayo y mostrarlos

        ArrayList<LibroEnsayo> estanteLibrosEnsayo;

        public void mostrarLibrosEnsayo(){
            estanteLibrosEnsayo = new ArrayList<>();

            for (Libro item : getContenedorLibros()){
                if (item instanceof LibroEnsayo){
                    estanteLibrosEnsayo.add((LibroEnsayo) item);
                }
            }

            System.out.println("Los libros que están en la biblioteca de Ensayos son:");
            for (LibroEnsayo item : estanteLibrosEnsayo){
                System.out.println(item);
            }
        }
    }

    }
