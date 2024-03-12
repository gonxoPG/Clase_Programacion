package model;

public class Triangulo {
    private int base, altura;

    public Triangulo() {}

    public Triangulo(int bas, int alt) {
        this.base = bas;
        this.altura = alt;
    }

    public int calcularArea(){
        int area = (this.base*this.altura);
        return area;
    }
}
