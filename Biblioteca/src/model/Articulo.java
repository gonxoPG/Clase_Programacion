package model;

public abstract class Articulo implements Prestable{
    private int id;
    private String seccion, titulo;
    private boolean estado;

    public Articulo() {}

    public Articulo(int id, String seccion, String titulo, boolean estado) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado = estado;
    }

    public void mostrarDatos(){
        System.out.println("ID = " + id);
        System.out.println("Sección = " + seccion);
        System.out.println("Título = " + titulo);
        System.out.println("Estado = " + estado);
    }

    @Override
    public boolean prestar() {
        return this.estado = false;
    }

    @Override
    public boolean devolver() {
        return this.estado = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
