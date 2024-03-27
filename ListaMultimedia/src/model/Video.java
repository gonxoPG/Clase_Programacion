package model;

public final class Video extends Elemento{
    private Persona director;
    private Persona[] actores;

    public Video() {}

    public Video(int id, int tamanio, String titulo, String formato, Persona autor, Persona director, Persona[] actores) {
        super(id, tamanio, titulo, formato, autor);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        director.mostrarDatos();
        for (Persona item : actores){
            item.mostrarDatos();
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public Persona[] getActores() {
        return actores;
    }

    public void setActores(Persona[] actores) {
        this.actores = actores;
    }
}
