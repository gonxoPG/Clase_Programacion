package controller;

import model.Local;
import model.Nacional;
import model.Provincial;

import java.util.ArrayList;

public class Centralita {
    ArrayList<Llamada> registroLlamadas;

    double costeTotal;

    public Centralita() {
        registroLlamadas = new ArrayList<>();
    }

    public void registrarLlamadas(Llamada llamada) {
        registroLlamadas.add(llamada);

        //mostrarLlamadas();
    }

    public void mostrarLlamadas() {
        for (Llamada item : registroLlamadas) {
            item.mostrarLlamada();
        }
    }

    public void mostrarCostesTotales() {
        for (Llamada item : registroLlamadas) {
            if (item instanceof Local) {
                costeTotal += ((Local) item).getCoste();
            }

            if (item instanceof Provincial) {
                costeTotal += ((Provincial) item).getCoste();
            }

            if (item instanceof Nacional) {
                costeTotal += ((Nacional) item).getCosteTotalNacional();
            }
        }
        System.out.println("El coste total acumulado en la centralita es " + costeTotal);
    }
}
