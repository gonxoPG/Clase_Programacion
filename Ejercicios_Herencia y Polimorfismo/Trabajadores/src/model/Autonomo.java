package model;

public class Autonomo extends Trabajador{
    private int sueldo;
    private boolean contratado;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String DNI, int sueldo, boolean contratado) {
        super(nombre, apellido, DNI);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        int sueldoAnual = sueldo*12;
        System.out.println("Salario anual: "+sueldoAnual);
        /*System.out.println("Sueldo = " + sueldo);
        System.out.println("Contratado = " + contratado);*/

        // Nombre: XXX Apellido: XXX DNI: XXX Salario Anual: XXX
    }
}
