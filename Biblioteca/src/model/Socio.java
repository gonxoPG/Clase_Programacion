package model;

import java.util.ArrayList;

public class Socio extends Personal{
    private int numeroSocio;
    private ArrayList<Articulo> prestamos;

    public Socio() {
        prestamos = new ArrayList<>();
    }

    public Socio(String nombre, String apellidos, String DNI) {
        super(nombre, apellidos, DNI);
        this.numeroSocio = (int) (Math.random()*100);
        prestamos = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de socio = " + numeroSocio);
        for (Articulo item : prestamos){
            System.out.println("Préstamos = " + item.getTitulo());
        }
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public ArrayList<Articulo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Articulo> prestamos) {
        this.prestamos = prestamos;
    }
}
