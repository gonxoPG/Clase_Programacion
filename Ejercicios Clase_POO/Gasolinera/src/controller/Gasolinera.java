package controller;

import model.Surtidor;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    ArrayList<Surtidor> listaSurtidores;
    private int ganancias;

    public Gasolinera() {}

    public Gasolinera(String nombre) {
        this.nombre = nombre;
        this.listaSurtidores = new ArrayList<>();
        // el resto de atributos ya los inicializa por defecto en 0
    }

    public int obtenerGanancias(){ //esto es como hacer el getter!!!
        return ganancias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getListaSurtidores() {
        return listaSurtidores;
    }

    public void setListaSurtidores(Surtidor surtidor) {
        listaSurtidores.add(surtidor);
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
