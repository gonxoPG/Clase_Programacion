import model.Persona;
import util.EdadInvalidaException;
import util.NombreInvalidoException;

public class Entrada {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juana", 18);
        Persona persona2 = new Persona ("Raúl", -55);
        Persona persona3 = new Persona("Chema!", 22);

        try {
            persona1.validarDatos();
            persona2.validarDatos();
            persona3.validarDatos();
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e2) {
            System.out.println(e2.getMessage());
        }
    }

    /*public static void main(String[] args) {
        Persona persona1;
        Persona persona2;
        Persona persona3;
        try {
            persona1 = new Persona("Juana", 18);
            persona2 = new Persona ("Raul", -55);
            persona3 = new Persona("Chema", 22);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e2) {
            System.out.println(e2.getMessage());
        }
    }*/
}
