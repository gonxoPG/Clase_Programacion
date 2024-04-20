package model;

import util.EdadInvalidaException;
import util.NombreInvalidoException;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

        /*if (this.edad<0){
            throw new EdadInvalidaException("La edad introducida no es válida");
        }

        if (!this.nombre.contains("!,@#¿?")){
            throw new NombreInvalidoException("El nombre contiene caracteres no válidos");
        }*/
    }

    public void validarDatos() throws EdadInvalidaException, NombreInvalidoException {
        //lanza las excepciones personalizadas
        if (this.edad<0){
            throw new EdadInvalidaException("La edad introducida no es válida");
        }

        if (this.nombre.contains("!,@#¿?")){
            throw new NombreInvalidoException("El nombre contiene caracteres no válidos");
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
