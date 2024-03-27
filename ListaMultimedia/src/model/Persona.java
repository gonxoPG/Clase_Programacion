package model;

public class Persona {
    private String nombre, DNI;

    public Persona() {}

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public void mostrarDatos(){
        System.out.println("Nombre = " + nombre);
        System.out.println("DNI = " + DNI);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
