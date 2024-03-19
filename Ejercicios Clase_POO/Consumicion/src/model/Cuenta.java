package model;

import java.util.ArrayList;

public class Cuenta {

    private int identificador;

    private boolean estado;

    private ArrayList<Articulo> almacenArticulos;

    public Cuenta() {
        almacenArticulos = new ArrayList<>();
    }

    public Cuenta(int identificador) {
        this.identificador = identificador;
    }

    public void agregarArticulo(Articulo articulo){
        almacenArticulos.add(articulo);
    }

    public int numeroArticulos(){
        return almacenArticulos.size();
    }

    public double costeTotalConsumicion(){
        double costeTotal = 0;

        for (Articulo item : almacenArticulos)
            costeTotal += item.getCoste();
        return costeTotal;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
