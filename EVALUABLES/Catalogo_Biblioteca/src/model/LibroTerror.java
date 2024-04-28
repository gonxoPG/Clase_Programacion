package model;

import controller.Libro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public final class LibroTerror extends Libro {

    private int calificacion;

    public LibroTerror(String autor, int nPaginas, int ISBN, int calificacion) {
        super(autor, nPaginas, ISBN);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos(int ISBN) {
        super.mostrarDatos(ISBN);
        System.out.println("Calificación = " + calificacion);
        System.out.println();
    }
}
