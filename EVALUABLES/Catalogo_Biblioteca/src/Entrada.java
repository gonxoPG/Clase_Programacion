import controller.Biblioteca;
import controller.Libro;
import model.*;
import utils.*;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Biblioteca biblioteca;

        System.out.println("📚 Bienvenido al programa gestor de bibliotecas 📚\n");
        System.out.println("¿Qué tipo de biblioteca te interesa: general o especializada?");

        String seleccion = teclado.next();

        if (seleccion.equalsIgnoreCase("general")) {
            biblioteca = new BibliotecaGeneral();
            System.out.println("Se ha creado una biblioteca general\n");
        } else {
            biblioteca = new BibliotecaEspecializada();
            System.out.println("Se ha creado una biblioteca especializada\n");
        }

        System.out.println("Como eres nuevo por aquí, vamos a registrar tus datos. Por favor, introduce tu nombre, apellido y DNI:");
        String nombre = teclado.next();
        String apellidos = teclado.next();
        String DNI = teclado.next();

        biblioteca.nuevoUsuario(nombre, apellidos, DNI);

        System.out.println("Ahora vamos a crear un catálogo de 4 libros en la biblioteca que has escogido 📕📗📘📙\n");
        biblioteca.construirCatalogo(4);

        System.out.println("Imagínate que quisiésemos añadir 5 libros a este catálogo que hemos creado. Veamos que ocurriría...\n");

        try {
            biblioteca.agregarLibro(new LibroTerror("Stephen King", 400, 9759, 9));
            biblioteca.agregarLibro(new LibroComedia("Terry Pratchett", 416, 9287, TipoHumor.hironico));
            biblioteca.agregarLibro(new LibroPoliciaca("Agatha Christie", 224, 2675, Trama.intriga, Personajes.protagonista));
            biblioteca.agregarLibro(new LibroEnsayo("Michel de Montaigne", 1300, 1322));
            biblioteca.agregarLibro(new LibroEnsayo("Ralph Waldo Emerson", 200, 9094));
        } catch (HuecoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        biblioteca.mostrarCatalogo();

        System.out.println("Una vez realizado todo lo que pedía el ejercicio, ahora le toca al Usuario gestionar la biblioteca.\n");

        int seleccionNum;
        do {
            System.out.println("Hola "+nombre+" "+apellidos+". Elige la operación que deseas realizar:");
            System.out.println("1. Agregar libros");
            System.out.println("2. Eliminar libros");
            System.out.println("3. Buscar libros por ISBN");
            System.out.println("4. Mostrar todos los libros disponibles");
            System.out.println("5. Salir");

            seleccionNum = teclado.nextInt();

            switch (seleccionNum){
                case 1:
                    System.out.println("Introduce el autor, el número de páginas y el ISBN del libro que quieres agregar");
                    String autor = teclado.next();
                    int nPaginas = teclado.nextInt();
                    int ISBN = teclado.nextInt();

                    Libro libro1 = new LibroEnsayo(autor, nPaginas, ISBN);
                    try {
                        biblioteca.agregarLibro(libro1);
                    } catch (HuecoInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Eliminar libros puede ser útil para hacer hueco en el catálogo. Introduce el ISBN del libro que quieres eliminar:");
                    ISBN = teclado.nextInt();
                    biblioteca.sacarLibro(ISBN);
                    break;

                case 3:
                    System.out.println("Introduce el ISBN para buscar un libro:");
                    ISBN = teclado.nextInt();

                    try {
                        biblioteca.buscarLibro(ISBN);
                    } catch (NoHayLibroException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    biblioteca.mostrarCatalogo();
                    break;

                case 5:
                    System.out.println("Saliendo...\n");
                    break;

                default:
                    System.out.println("La opción seleccionado no existe");
            }

        }while (seleccionNum != 5);

        teclado.close();
        biblioteca.exportarLibrosCatalogo();
        System.out.println();
        System.out.println("EL PROGRAMA HA FINALIZADO");
    }
}

