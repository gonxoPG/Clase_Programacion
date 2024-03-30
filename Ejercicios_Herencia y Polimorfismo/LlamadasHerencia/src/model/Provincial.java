package model;

import controller.Llamada;

public class Provincial extends Llamada {
    private double coste;

    public Provincial() {}

    public Provincial(int numOrigen, int numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
        this.coste = duracion*0.15;
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
