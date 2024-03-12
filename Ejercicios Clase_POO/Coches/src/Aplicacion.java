import model.Coche;
import model.Garaje;
import model.Motor;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Garaje garaje = new Garaje();

        Coche coche1 = new Coche("Ford", "Cmax");
        Coche coche2 = new Coche("Skoda", "Octavia");

        //bucle x2
        for (int i = 0; i < 2; i++) {

            System.out.printf("¿Qué avería tiene el %s %s?\n", coche1.getMarca(),coche1.getModelo());
            garaje.aceptarCoche(coche1, teclado.next());
            garaje.devolverCoche();

            //acumula coche.precioAcumuladoAverias
            coche1.acumularAveria((Math.random()*501));

            System.out.printf("¿Qué avería tiene el %s %s?\n", coche2.getMarca(), coche2.getModelo());
            garaje.aceptarCoche(coche2, teclado.next());
            garaje.devolverCoche();

            //acumula coche.precioAcumuladoAverias
            coche2.acumularAveria((Math.random()*501));

        }

        coche1.mostrarDatos();
        coche2.mostrarDatos();


    }
}
