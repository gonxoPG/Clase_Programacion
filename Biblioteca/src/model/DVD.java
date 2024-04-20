package model;

public class DVD extends Articulo{
    private int anioEdicion;
    private String director, actores;
    private GeneroDVD tipo; //enum

    public DVD() {
    }

    public DVD(int id, String seccion, String titulo, boolean estado, int anioEdicion, String director, String actores, GeneroDVD tipo) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año de edición = " + anioEdicion);
        System.out.println("Director = " + director);
        System.out.println("Actores = " + actores);
        System.out.println("Tipo = " + tipo);
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public GeneroDVD getTipo() {
        return tipo;
    }

    public void setTipo(GeneroDVD tipo) {
        this.tipo = tipo;
    }
}
