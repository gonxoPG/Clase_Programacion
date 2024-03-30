package model;

import controller.Empresa;

public class Jefe extends Trabajador{
    private int acciones, beneficio;

    private Empresa empresa;

    public Jefe() {}

    public Jefe(String nombre, String apellido, String DNI, int acciones, int beneficio) {
        super(nombre, apellido, DNI);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Acciones: %d Beneficio: %d\n", acciones, beneficio);

        //Nombre: XXX Apellido: XXX DNI: XXX  Acciones: XXX Beneficio: XXX
    }
}
