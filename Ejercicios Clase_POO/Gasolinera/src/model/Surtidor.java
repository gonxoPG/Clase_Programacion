package model;

public class Surtidor {
    private int capacidadTotal, capacidadActual;

    private String tipoGasolina;

    private boolean funcionaSurtidor;

    public Surtidor() {}

    public Surtidor(int capacidadTotal, String tipoGasolina) {
        this.capacidadTotal = capacidadTotal;
        this.tipoGasolina = tipoGasolina;
        this.funcionaSurtidor = true;
        this.capacidadActual = this.capacidadTotal;
    }

    public Surtidor(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        // capacidadTotal y capacidadActual ya están inicializados por defecto en 0
        this.funcionaSurtidor = true; //solo inicializo este a true porque por defecto es false
    }

    public void arreglarSurtidor(){
        funcionaSurtidor = true;
    }

    public void rellenarGasolina(int cantidad){
        capacidadActual += cantidad;
    }

    public void quitarGasolina(int cantidad){
        capacidadActual -= cantidad;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public boolean isFuncionaSurtidor() {
        return funcionaSurtidor;
    }

    public void setFuncionaSurtidor(boolean funcionaSurtidor) {
        this.funcionaSurtidor = funcionaSurtidor;
    }
}
