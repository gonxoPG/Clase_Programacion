package model;

public class Coche {
    private Motor motor = new Motor();
    private String marca, modelo;
    private double precioAcumuladoAverias;

    public Coche (){}
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    public double acumularAveria (int importe){
        this.precioAcumuladoAverias += importe;
        return precioAcumuladoAverias;
    }

    public void mostrarDatosCoche(){
        System.out.printf("El coche %s %s ",marca,modelo);
        System.out.printf(" tiene un motor de %d cavallos y un incremento de aceite de %d litros", motor.getCV(), motor.getLitrosAceite());
        System.out.printf(" y acumula %.2f € en averías",precioAcumuladoAverias);
        System.out.println();
    }
}
