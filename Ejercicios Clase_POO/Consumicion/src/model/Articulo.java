package model;

public class Articulo {

    private String nombre;
    private double coste;

    public Articulo() {}

    public Articulo(String nombre, double coste) {
        this.nombre = nombre;
        this.coste = coste;
        //inicializa con los valores dados (¿por el usuario?)
    }

    public void preciarArticulo(double importe){
        this.coste = importe;
    }

    public double getCoste() {
        return coste;
    }
}
