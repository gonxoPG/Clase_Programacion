package model;

import java.util.Scanner;

public class Coche {
    Scanner teclado = new Scanner(System.in);
    private String marca, modelo, matricula;
    private int cv, cc, velocidad;
    private double kms;

    public Coche() {
    }

    public void acelerar() {

        System.out.println("¿Cuántos Km/h quieres acelerar?");
        int velocidadAceleracion = teclado.nextInt();


        if (cv <= 100) {

            velocidad += (int) (Math.random() * velocidadAceleracion);
            if (velocidad < 10) {
                velocidad = 10;
            }
            kms += velocidad * 0.5;
        } else if (cv > 100) {
            velocidad += (int) ((Math.random() * velocidadAceleracion) + 10); // ese +10 asegura que la velocidad mínima van a ser 10 km/h
            kms += velocidad * 0.5;
        }
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Cavallos: " + cv);
        System.out.println("Cilindrada: " + cc);
        System.out.println();
        //System.out.println("Velocidad: "+velocidad);
        //System.out.println("Kilómetros recorridos: "+kms);
    }


    public double getKms() {
        return kms;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
