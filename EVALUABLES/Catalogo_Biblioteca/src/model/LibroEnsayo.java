package model;

import controller.Libro;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class LibroEnsayo extends Libro {

    public LibroEnsayo(String autor, int nPaginas, int ISBN) {
        super(autor, nPaginas, ISBN);
    }

    @Override
    public void mostrarDatos(int ISBN) {
        super.mostrarDatos(ISBN);
        System.out.println();
    }
}
