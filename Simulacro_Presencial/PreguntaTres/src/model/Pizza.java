package model;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> conjuntoIngredientes;

    public Pizza() {
        conjuntoIngredientes = new ArrayList<>();
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        conjuntoIngredientes = new ArrayList<>();
    }

    public void aniadirIngrediente(Ingrediente ingrediente){
        conjuntoIngredientes.add(ingrediente);
        precio += ingrediente.getPrecio();
    }

    public void mostrarDatos(){
        System.out.println("Tu pizza con nombre "+nombre+" tiene un precio de "+precio+" y sus ingredientes son:");

        for (Ingrediente item : conjuntoIngredientes){
            System.out.println(item.getNombre());
        }
    }
}
