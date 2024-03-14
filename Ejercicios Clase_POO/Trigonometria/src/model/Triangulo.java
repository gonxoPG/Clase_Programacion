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

    public void mostrarDatos(){
        System.out.printf("El triángulo tiene una base de %d y una altura de %d y por tanto su área es de %d\n",base, altura, calcularArea());
    }
}
