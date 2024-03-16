package model;

public class Persona {
    private String nombre, apellido, DNI;
    private int telefono;

    public Persona() {}

    public Persona(String nombre, String apellido, String DNI, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("DNI = " + DNI);
        System.out.println("Teléfono = " + telefono);
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
