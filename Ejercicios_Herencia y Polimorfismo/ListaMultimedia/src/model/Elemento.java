package model;

public abstract class Elemento {
    private int id, tamanio;
    private String titulo, formato;
    private Persona autor;

    public Elemento() {}

    public Elemento(int id, int tamanio, String titulo, String formato, Persona autor) {
        this.id = id;
        this.tamanio = tamanio;
        this.titulo = titulo;
        this.formato = formato;
        this.autor = autor;
    }

    public void mostrarDatos(){
        System.out.println("Identificador = " + id);
        System.out.println("Titulo = " + titulo);
        System.out.println("Tamaño = " + tamanio);
        System.out.println("Formato = " + formato);
        autor.mostrarDatos();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
