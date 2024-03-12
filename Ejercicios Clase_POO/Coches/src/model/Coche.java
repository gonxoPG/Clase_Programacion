package model;

import java.util.Scanner;

public class Coche{
    private Motor motor;
    private String marca, modelo;
    private double precioAcumuladoAverias;

    Scanner teclado = new Scanner(System.in);
    public Coche() {
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.printf("¿Cuántos caballos quieres que tenga el %s %s?", marca, modelo);
        System.out.println();
        this.motor = new Motor(teclado.nextInt());
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAcumuladoAverias() {
        return precioAcumuladoAverias;
    }


    public double acumularAveria(double importe) {
        this.precioAcumuladoAverias += importe;
        return precioAcumuladoAverias;
    }

    public void mostrarDatos (){
        System.out.printf("El coche %s %s ", marca,modelo);
        System.out.printf(" tiene un motor de %d caballos y un incremento de aceite de %d litros", motor.getCV(), motor.getLitrosAceite());
        System.out.printf(" y acumula %.2f € en averías", precioAcumuladoAverias);
        System.out.println();
    }

}
