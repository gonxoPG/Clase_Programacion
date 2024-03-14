package model;

public class Cuadrado {

    private int base, altura;
    private double area, perimetro;

    public Cuadrado() {}

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        this.area = this.base*this.altura;
    }

    public void calcularPerimetro(){
        this.perimetro = 2*this.altura + 2*this.base;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void mostrarDatos(){
        calcularArea();
        calcularPerimetro();
        System.out.printf("El cuadrado tiene una base de %d y una altura de %d. Su perímetro es de %.2f y su área es de %.2f\n", base, altura, perimetro, area);
    }
}
