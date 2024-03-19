import controller.Gasolinera;
import model.Coche;
import model.Surtidor;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Surtidor surtidorUno = new Surtidor(1000,"95 sin plomo");
        Surtidor surtidorDos = new Surtidor(800,"98 sin plomo");
        Surtidor surtidorTres = new Surtidor("diésel");

        Gasolinera gasolineraCarretera = new Gasolinera("Repsol");

        gasolineraCarretera.setListaSurtidores(surtidorUno);
        gasolineraCarretera.setListaSurtidores(surtidorDos);
        gasolineraCarretera.setListaSurtidores(surtidorTres);


        Coche audi = new Coche("95 sin plomo");

        System.out.println("Surtidor 1:");
        audi.ponerGasolina(surtidorUno,60);
        System.out.println();
        System.out.println("Surtidor 2:");
        audi.ponerGasolina(surtidorDos, 60);
        System.out.println();
        System.out.println("Surtidor 3:");
        audi.ponerGasolina(surtidorTres, 60);
    }
}
