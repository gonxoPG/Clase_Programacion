package model;

import java.util.Scanner;

public class Coche {
    Scanner teclado = new Scanner(System.in);
    private String marca, modelo, matricula;
    private int cv, cc, velocidad;
    private double kms;

    public Coche() {
    }

    public void acelerar (){

        System.out.println("¿Cuántos Km/h quieres acelerar?");
        int velocidadAceleracion = teclado.nextInt();

        velocidad = 10;

        if (cv<=100){
            velocidad += (int) (Math.random()*velocidadAceleracion);
            kms += velocidad * 0.5;
        }else {
            velocidad += (int) ((Math.random()*velocidadAceleracion) + 10);
            kms += velocidad * 0.5;
        }

    }

    public void mostrarDatos (){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Cavallos: "+cv);
        System.out.println("Cilindrada: "+cc);
        System.out.println();
        //System.out.println("Velocidad: "+velocidad);
        //System.out.println("Kilómetros recorridos: "+kms);
    }

    public void mostrarVelocidadKms(){
        System.out.println("La velocidad acumulada es "+velocidad+" Km/h");
        System.out.println("Los kilómetros acumulados son "+kms);
    }

    public double getKms() {
        return kms;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
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
