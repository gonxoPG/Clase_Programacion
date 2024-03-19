package model;

public class LlamadaNacional {
    private long numeroOrigen, numeroDestino;
    private double coste;
    private int destino; //podrá ser A, B o C (¿numeros correspondientes al ASCII?)
    private double duracionSec;

    public LlamadaNacional() {}

    public LlamadaNacional(long numeroOrigen, long numeroDestino, char destino, double duracionSec) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.destino = destino;
        this.duracionSec = duracionSec;
        
        if (destino == 'A'){
            this.coste = duracionSec*0.40;
        } else if (destino == 'B') {
            this.coste = duracionSec*0.50;
        }else if (destino == 'C'){
            this.coste = duracionSec*0.60;
        }else {
            this.coste = duracionSec*0.70;
        }
    }
    
    public void mostrarDatos(){
        System.out.println("Número de origen = " + numeroOrigen);
        System.out.println("Número de destino = " + numeroDestino);
        System.out.println("Coste = " + coste);
        System.out.println("Destino = " + destino);
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

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getDuracionSec() {
        return duracionSec;
    }

    public void setDuracionSec(double duracionSec) {
        this.duracionSec = duracionSec;
    }
}
