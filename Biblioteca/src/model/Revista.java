package model;

public class Revista extends Articulo{
    private int ISBN;

    public Revista() {
    }

    public Revista(int id, String seccion, String titulo, boolean estado, int ISBN) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN = " + ISBN);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
