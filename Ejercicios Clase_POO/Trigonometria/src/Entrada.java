import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

public class Entrada {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10,5);
        Circulo circulo = new Circulo(25);
        Cuadrado cuadrado = new Cuadrado(15, 15);

        circulo.calcularArea();
        circulo.calcularDiametro();
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();

        System.out.printf("El área del triángulo es %d\n",triangulo.calcularArea());
        System.out.printf("El área del círculo es %.2f y su diámetro es %.2f\n", circulo.getArea(), circulo.getDiametro());
        System.out.printf("El área del cuadrado es %.2f y su perímetro es %.2f\n", cuadrado.getArea(), cuadrado.getPerimetro());

    }
}
