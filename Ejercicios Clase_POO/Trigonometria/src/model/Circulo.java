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

    public void mostrarDatos(){
        calcularDiametro();
        calcularArea();
        System.out.printf("El círculo tiene un radio de %.2f y un diámetro de %.2f y por tanto su área es de %.2f\n", radio, diametro, area);
    }
}
