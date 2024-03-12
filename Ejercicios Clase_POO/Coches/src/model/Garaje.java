package model;

import java.util.Scanner;

public class Garaje {
    private Coche coche;
    private String averiaAsociada;
    private int acumuladoCoches;
    Scanner teclado = new Scanner(System.in);

    //control de entrada de coches
    private boolean atender;
    private int atendiendoCoche;


    public Garaje() {}

    public void aceptarCoche(Coche coche, String averia) {

        //El garaje solo podrá atender a un coche en cada momento.
        if (atendiendoCoche == 0) {
            atender = true;
        } else {
            atender = false;
        }

        if (atender) {
            this.coche = coche;
            this.averiaAsociada = averia;

            if (averiaAsociada.equalsIgnoreCase("aceite")) {
               Motor motorCoche = coche.getMotor();
               motorCoche.setLitrosAceite(10);
            }

            this.acumuladoCoches += 1;
        }
    }

    public void devolverCoche() {
        atendiendoCoche = 0;
    }

}
