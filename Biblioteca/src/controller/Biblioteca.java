package controller;

import model.Articulo;
import model.Personal;
import model.Socio;
import model.Trabajador;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Personal> listaPersonal;
    ArrayList<Articulo> inventarioArticulos;

    private Trabajador trabajador;
    private Socio socio;

    public Biblioteca() {
        listaPersonal = new ArrayList<>();
        inventarioArticulos = new ArrayList<>();
    }

    public void registrarPersonal(Personal persona) {
        listaPersonal.add(persona);
    }

    public void registrarArticuloAlquilable(Articulo articulo) {
        inventarioArticulos.add(articulo);
    }

    public void realizarPrestamo(Socio socio, Articulo articulo){
        for (Articulo item: inventarioArticulos){
            if (item.isEstado()){
                socio.getPrestamos().add(articulo);
                articulo.prestar();
                System.out.println("El "+articulo.getTitulo()+" se ha prestado a "+socio.getNombre());
            } else {
                System.out.println("El artículo no se encuentra disponible para ser prestado");
            }
        }
    }

    public void devolverPrestamo (Socio socio, Articulo articulo){
        for (Articulo item : socio.getPrestamos()){
            if (item == articulo){
                socio.getPrestamos().remove(articulo);
                articulo.devolver();
                System.out.println("El artículo se ha devuelto correctamente a la biblioteca");
            }else {
                System.out.println("Este socio no tiene este artículo");
            }
        }
    }

    public void mostrarPrestamos(){
        System.out.println("Los préstamos son los siguientes:");
        for (Articulo item : inventarioArticulos){
            if (!item.isEstado()){
                item.mostrarDatos();
            }
        }
    }

    public void mostrarDisponibles(){
        System.out.println("Los artículos disponibles son los siguientes:");
        for (Articulo item : inventarioArticulos){
            if (item.isEstado()){
                item.mostrarDatos();
            }
        }
    }

    public void mostrarArticulosSocio(String DNI){ //por consola
        System.out.println("El socio con DNI "+DNI+" tiene alquilados los siguiente artículos:");
        for (Personal item : listaPersonal){
            if (item.getDNI().equalsIgnoreCase(DNI)){
                item.mostrarDatos();
            }
        }
    }
}
