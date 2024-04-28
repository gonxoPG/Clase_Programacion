package model;

import controller.Libro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.TipoHumor;

@NoArgsConstructor
@Getter
@Setter

public final class LibroComedia extends Libro {

    private TipoHumor tipoHumor;

    public LibroComedia(String autor, int nPaginas, int ISBN, TipoHumor tipoHumor) {
        super(autor, nPaginas, ISBN);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarDatos(int ISBN) {
        super.mostrarDatos(ISBN);
        System.out.println("Tipo de humor = " + tipoHumor);
        System.out.println();
    }
}
