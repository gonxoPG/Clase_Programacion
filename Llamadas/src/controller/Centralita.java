package controller;

import model.LlamadaLocal;
import model.LlamadaNacional;

import java.util.ArrayList;

public class Centralita {
    private ArrayList<LlamadaLocal> listaLocales;
    private ArrayList<LlamadaNacional> listaNacionales;
    private int costeAcumulado;

    public Centralita() {}

    public Centralita(ArrayList<LlamadaLocal> listaLocales, ArrayList<LlamadaNacional> listaNacionales, int costeAcumulado) {
        this.listaLocales = listaLocales;
        this.listaNacionales = listaNacionales;
        this.costeAcumulado = costeAcumulado;
    }

    public void agregarLocal(LlamadaLocal llamadalocal){
        listaLocales = new ArrayList<>();
        listaLocales.add(llamadalocal);
    }

    public void agregarNacional(LlamadaNacional llamadanacional){
        listaNacionales = new ArrayList<>();
        listaNacionales.add(llamadanacional);
    }

    public void listarLocales(){
        for (LlamadaLocal item : listaLocales){
            item.mostrarDatos();
        }
    }

    public void listarNacionales(){
        for (LlamadaNacional item : listaNacionales){
            item.mostrarDatos();
        }
    }

    public void mostrarCostes(){
        System.out.println("El coste acumulado de la centralita es "+costeAcumulado);
    }

    public ArrayList<LlamadaLocal> getListaLocales() {
        return listaLocales;
    }

    public void setListaLocales(ArrayList<LlamadaLocal> listaLocales) {
        this.listaLocales = listaLocales;
    }

    public ArrayList<LlamadaNacional> getListaNacionales() {
        return listaNacionales;
    }

    public void setListaNacionales(ArrayList<LlamadaNacional> listaNacionales) {
        this.listaNacionales = listaNacionales;
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

    public void setCosteAcumulado(int costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }
}
