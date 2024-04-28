package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter

public abstract class Libro implements Serializable {

    private static final long serialVersionUID = 123456879L;
    private String autor;
    private int nPaginas, ISBN;

    public Libro(String autor, int nPaginas, int ISBN) {
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.ISBN = ISBN;
    }

    public void mostrarDatos(int ISBN){
        if (ISBN == this.ISBN){
        System.out.println("Autor = " + autor);
        System.out.println("Número de páginas = " + nPaginas);
        System.out.println("ISBN = " + ISBN);
        }else{
            System.out.println("El ISBN no coincide con ningún libro");
        }
    }

}
