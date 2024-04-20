package model;

public class CD extends Articulo{
    private int anioEdicion;
    private GeneroCD tipo; // enum

    public CD() {
    }

    public CD(int id, String seccion, String titulo, boolean estado, int anioEdicion, GeneroCD tipo) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año de edicion = " + anioEdicion);
        System.out.println("Tipo = " + tipo);
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public GeneroCD getTipo() {
        return tipo;
    }

    public void setTipo(GeneroCD tipo) {
        this.tipo = tipo;
    }
}
