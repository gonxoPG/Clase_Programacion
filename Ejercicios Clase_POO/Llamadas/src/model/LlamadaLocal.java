package model;

public class LlamadaLocal {
    private long numeroOrigen, numeroDestino;
    private double coste, duracionSec;

    public LlamadaLocal() {}

    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracionSec) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracionSec = duracionSec;
        this.coste = (duracionSec*0.15) + 0.50;
    }

    public void mostrarDatos(){
        System.out.println("Número de origen = " + numeroOrigen);
        System.out.println("Número de destino = " + numeroDestino);
        System.out.println("Coste = " + coste);
        System.out.println("Duración (en segundos) = " + duracionSec);
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracionSec() {
        return duracionSec;
    }

    public void setDuracionSec(double duracionSec) {
        this.duracionSec = duracionSec;
    }
}
