package model;

public class Circulo {

    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea(double rad){
        this.area = Math.PI*Math.pow(rad,2);
    }

    public void calcularDiametro(double rad){
        this.diametro = 2*rad;
    }
}
