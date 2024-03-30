package model;

import controller.Llamada;

public class Local extends Llamada {

    double coste;
    public Local() {}

    public Local(int numOrigen, int numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
        this.coste = 0;
    }

    @Override
    public void mostrarLlamada() {
        super.mostrarLlamada();
        System.out.println("Coste = " + coste);
        System.out.println();
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
