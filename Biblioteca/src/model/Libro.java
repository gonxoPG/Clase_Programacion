package model;

public class Libro extends Articulo{
    private int ISBN, paginas;
    private String autor, editorial;

    public Libro() {
    }

    public Libro(int id, String seccion, String titulo, boolean estado, int ISBN, int paginas, String autor, String editorial) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN = " + ISBN);
        System.out.println("Páginas = " + paginas);
        System.out.println("Autor = " + autor);
        System.out.println("Editorial = " + editorial);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
