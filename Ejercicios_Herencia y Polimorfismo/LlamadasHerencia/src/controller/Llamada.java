package controller;

public abstract class Llamada {
    private int numOrigen, numDestino;
    private double duracion;

    public Llamada() {}

    public Llamada(int numOrigen, int numDestino, double duracion) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
    }

    public void mostrarLlamada(){
        System.out.println("Origen = " + numOrigen);
        System.out.println("Destino = " + numDestino);
        System.out.println("Duración = " + duracion);
    }

    public int getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(int numOrigen) {
        this.numOrigen = numOrigen;
    }

    public int getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
