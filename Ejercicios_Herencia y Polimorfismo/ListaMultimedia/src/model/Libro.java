package model;

public final class Libro extends Elemento{

    private String ISBN;
    private int nPaginas;

    public Libro() {}

    public Libro(int id, int tamanio, String titulo, String formato, Persona autor, String ISBN, int nPaginas) {
        super(id, tamanio, titulo, formato, autor);
        this.ISBN = ISBN;
        this.nPaginas = nPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN = " + ISBN);
        System.out.println("Nº de páginas = " + nPaginas);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
