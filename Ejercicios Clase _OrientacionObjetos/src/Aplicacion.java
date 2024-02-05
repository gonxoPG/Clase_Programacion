import model.Coche;
import model.Garaje;
import model.Motor;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Garaje garaje = new Garaje();
        Motor motor = new Motor();

        Coche coche1 = new Coche("Ford", "Cmax");
        Coche coche2 = new Coche("Skoda", "Octavia");

        /*for (int i = 0; i < 2; i++) {
            System.out.println("¿Qué avería tiene el coche?");
            garaje.aceptarCoche(i, teclado.next());
            System.out.println(garaje.getAveriaAsociada());
            coche1.acumularAveria((int) Math.random() * 1000);

        }*/
        garaje.devolverCoche();
        coche1.mostrarDatosCoche();
        coche2.mostrarDatosCoche();
    }
}
