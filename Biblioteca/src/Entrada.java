import controller.Biblioteca;
import model.*;

public class Entrada {
    //en este caso, todos los artículos son prestables

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Socio socio = new Socio("Ramón", "Pérez Ramírez", "1234a");

        Libro libro = new Libro(01, "01A", "El Quijote", true, 123456, 500,
                "Miguel Cervantes", "Alianza");

        Revista revista = new Revista(02, "02B", "Hobby", true, 456798);
        CD cd = new CD(03, "03C", "Bandas Sonoras", true, 1998, GeneroCD.musical); //GeneroCD.musical
        DVD dvd = new DVD(04, "04D", "El Señor de los Anillos", true, 2001,
                "Steven Spielberg", "Orlando Bloom", GeneroDVD.drama); //GeneroDVD.drama

        biblioteca.registrarPersonal(socio);

        biblioteca.registrarArticuloAlquilable(libro);
        biblioteca.registrarArticuloAlquilable(revista);
        biblioteca.registrarArticuloAlquilable(cd);
        biblioteca.registrarArticuloAlquilable(dvd);

        biblioteca.realizarPrestamo(socio, libro);

        biblioteca.mostrarArticulosSocio("1234a");
        biblioteca.mostrarDisponibles();
        biblioteca.mostrarPrestamos();

        biblioteca.devolverPrestamo(socio, libro);
    }
}

//da errores: CORREGIR
