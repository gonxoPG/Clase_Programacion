package model;

public class Circulo {

    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        this.area = Math.PI*Math.pow(this.radio,2);
    }

    public void calcularDiametro(){
        this.diametro = 2*this.radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }
}
