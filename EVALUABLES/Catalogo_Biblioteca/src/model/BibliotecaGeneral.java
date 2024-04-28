package model;

import controller.Biblioteca;
import controller.Libro;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class BibliotecaGeneral extends Biblioteca {

    /*aunque me podía haber ahorrado esta clase metiendo el método mostrarDatos() en la clase Biblioteca, he preferido que quedase
     distinguido*/
    public void mostrarDatos(){
        System.out.println("Los libros que están en la biblioteca General son:");
        for (Libro item : getContenedorLibros()){
            System.out.println(item);
        }
    }
}
