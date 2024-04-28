package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public final class Usuario {

    private String nombre, apellidos, DNI;
    private int numUsuario;
    private static int contadorUsuarios; // la convierto en estática para que no empiece de 0 cada vez que se crea un usuario
    private Biblioteca biblioteca;

    public Usuario(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.numUsuario = ++contadorUsuarios;
    }

}
