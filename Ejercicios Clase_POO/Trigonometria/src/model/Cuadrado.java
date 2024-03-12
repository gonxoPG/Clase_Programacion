package model;

public class Cuadrado {

    private int base, altura;
    private double area, perimetro;

    public Cuadrado() {}

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(int bas, int alt){
        this.area = bas*alt;
    }

    public void calcularPerimetro(int alt, int bas){
        this.perimetro = 2*alt + 2*bas;
    }
}
