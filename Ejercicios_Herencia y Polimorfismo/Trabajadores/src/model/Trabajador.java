package model;

public class Trabajador {
    private String nombre, apellido, DNI;

    public Trabajador() {}

    public Trabajador(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s Apellido: %s DNI: %s ", nombre, apellido, DNI);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
