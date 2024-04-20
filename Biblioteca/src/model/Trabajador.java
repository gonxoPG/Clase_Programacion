package model;

public class Trabajador extends Personal{
    public Trabajador() {
    }

    public Trabajador(String nombre, String apellidos, String DNI) {
        super(nombre, apellidos, DNI);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
