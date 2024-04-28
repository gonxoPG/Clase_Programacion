package model;

import controller.Libro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.Personajes;
import utils.Trama;

@NoArgsConstructor
@Getter
@Setter

public final class LibroPoliciaca extends Libro {

    private Trama trama;
    private Personajes personajes;

    public LibroPoliciaca(String autor, int nPaginas, int ISBN, Trama trama, Personajes personajes) {
        super(autor, nPaginas, ISBN);
        this.trama = trama;
        this.personajes = personajes;
    }

    @Override
    public void mostrarDatos(int ISBN) {
        super.mostrarDatos(ISBN);
        System.out.println("Trama = " + trama);
        System.out.println("Personajes = " + personajes);
        System.out.println();
    }
}
