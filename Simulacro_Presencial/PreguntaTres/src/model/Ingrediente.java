package model;

public class Ingrediente {
    private String nombre;
    private double precio;

    public Ingrediente() {}

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
