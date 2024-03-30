package model;

public class Audio extends Elemento{
    private int duracion;
    private String soporte;

    public Audio() {}

    public Audio(int id, int tamanio, String titulo, String formato, Persona autor, int duracion, String soporte) {
        super(id, tamanio, titulo, formato, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración = " + duracion);
        System.out.println("Soporte = " + soporte);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
