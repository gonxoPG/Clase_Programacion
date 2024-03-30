package model;

import controller.Llamada;

public class Nacional extends Llamada {
    private double coste1, coste2, coste3;
    private double costeTotalNacional;

    public Nacional() {}

    public double getCosteTotalNacional() {
        return costeTotalNacional;
    }

    public void setCosteTotalNacional(double costeTotalNacional) {
        this.costeTotalNacional = costeTotalNacional;
    }

    public Nacional(int numOrigen, int numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
        this.coste1 = duracion*0.20;
        this.coste2 = duracion*0.25;
        this.coste3 = duracion*0.30;
        this.costeTotalNacional = coste1 + coste2 + coste3;
    }

    @Override
    public void mostrarLlamada() {
        super.mostrarLlamada();
        System.out.println("Franja 1 = " + coste1);
        System.out.println("Franja 2 = " + coste2);
        System.out.println("Franja 3 = " + coste3);
        System.out.println();
    }

    public double getCoste1() {
        return coste1;
    }

    public void setCoste1(double coste1) {
        this.coste1 = coste1;
    }

    public double getCoste2() {
        return coste2;
    }

    public void setCoste2(double coste2) {
        this.coste2 = coste2;
    }

    public double getCoste3() {
        return coste3;
    }

    public void setCoste3(double coste3) {
        this.coste3 = coste3;
    }
}
