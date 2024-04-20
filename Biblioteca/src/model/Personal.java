package model;

public abstract class Personal {
    private String nombre, apellidos, DNI;

    public Personal() {
    }

    public Personal(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

    public void mostrarDatos(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("DNI = " + DNI);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
