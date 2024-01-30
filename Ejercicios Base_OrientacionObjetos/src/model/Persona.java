package model;

import java.sql.SQLOutput;

public class Persona {
    private String nombre, apellido, DNI;
    private double edad, peso;
    private int altura;

    //constructores
    public Persona() {
        // sin datos de entrada
        // todos inician por defecto a 0 y DNI inicia 111111111X
        nombre = "0";
        apellido = "0";
        DNI = "111111111X";
        edad = 0;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, String apellido, String DNI, double edad, double peso, int altura) {
        // todos los datos
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String apellido, String DNI, double edad) {
        // sin peso ni altura
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        //parámetros a 0
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        //DNI 111111111X
        this.DNI = "111111111X";
    }

    //método que saca todos los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }

    // Alt + Enter: getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void incrementoEdad(int numero) {
        System.out.println(edad + numero);
    }

    public void IMC() {
        double alturaMetros = (double) this.altura /100;
        System.out.println("la altura en metros es: "+alturaMetros);
        double IMC = this.peso / (alturaMetros * alturaMetros);
        System.out.println("Tu IMC es: "+IMC);

        if (IMC < 18.5) {
            System.out.println("Peso inferior al normal");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Tu peso es el normal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Peso superior al normal");
        } else if (IMC >= 30) {
            System.out.println("Tienes obesidad");
        } else {
            System.out.println("Error de peso");
        }
    }

    public void generoIMC(String genero){
        double alturaMetros = (double) this.altura /100;
        double IMC = this.peso / (alturaMetros * alturaMetros);
        System.out.println("Tu IMC es: "+IMC);

        switch (genero){

            case "hombre":
                if (IMC < 20) {
                    System.out.println("Peso inferior al normal");
                } else if (IMC >= 20 && IMC <= 26.9) {
                    System.out.println("Tu peso es el normal");
                } else if (IMC >= 27 && IMC <= 29.9) {
                    System.out.println("Peso superior al normal");
                } else if (IMC >= 30 && IMC <= 39.9) {
                    System.out.println("Tienes obesidad");
                } else if (IMC > 40){
                    System.out.println("Tienes obesidad mórbida");
                }else {
                    System.out.println("Error de peso");
                }
                break;

            case "mujer":
                if (IMC < 20) {
                    System.out.println("Peso inferior al normal");
                } else if (IMC >= 20 && IMC <= 24.9) {
                    System.out.println("Tu peso es el normal");
                } else if (IMC >= 25 && IMC <= 29.9) {
                    System.out.println("Peso superior al normal");
                } else if (IMC >= 30 && IMC <= 39.9) {
                    System.out.println("Tienes obesidad");
                } else if (IMC > 40){
                    System.out.println("Tienes obesidad mórbida");
                }else {
                    System.out.println("Error de peso");
                } break;
            default:
                System.out.println("Error de cálculo");
        }
    }
}
