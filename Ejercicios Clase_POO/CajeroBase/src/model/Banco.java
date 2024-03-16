package model;

import java.util.ArrayList;

public class Banco {

    private String nombre, CIF;
    private ArrayList<Cuenta> listadoCuentas;

    public Banco(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;

        listadoCuentas = new ArrayList<>();
    }


    public void abrirCuenta(String DNI) { // modifico: el DNI se crea aleatorio y el saldoInicial es 0

        Cuenta cuenta = new Cuenta((int) (Math.random() * 10001), (int) (Math.random() * 1000), 0, DNI);
        listadoCuentas.add(cuenta);
    }

    public void eliminarCuenta(String DNI, int PIN) {
        if (estaCuenta(DNI) == null) {
            System.out.println("No existe ninguna cuenta asociada a este DNI");
        } else {
            listadoCuentas.remove(estaCuenta(DNI));
            System.out.println("Cuenta borrada con éxito");
        }
    }

    public Cuenta estaCuenta(String DNI) {
        for (Cuenta item : listadoCuentas)
            if (item.getDNI() == DNI) {
                return item;
            }
        return null;
    }
}
