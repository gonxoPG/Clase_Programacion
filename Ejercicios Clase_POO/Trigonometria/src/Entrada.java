import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Triangulo triangulo;
        Circulo circulo;
        Cuadrado cuadrado = new Cuadrado(15, 15);

        Scanner teclado = new Scanner(System.in);
        int seleccion;

        do {


            System.out.println("Selecciona con qué figura quieres trabajar:");
            System.out.println("1. Triángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Salir");

            seleccion = teclado.nextInt();

            switch (seleccion) {

                case 1:
                    System.out.println("Estamos trabajando con un triángulo.");
                    System.out.println();
                    System.out.println("Introduce el tamaño de la base");
                    int baseTriangulo = teclado.nextInt();;
                    System.out.println("Introduce el tamaño de la altura");
                    int alturaTriangulo = teclado.nextInt();
                    triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

                    System.out.println("¿Qué operación quieres hacer?");
                    System.out.println("A. Calcular área");
                    System.out.println("B. Mostrar datos");

                    char seleccion2 = Character.toUpperCase(teclado.next().charAt(0));

                    switch (seleccion2) {

                        case 'A':

                            int areaTriangulo = triangulo.calcularArea();
                            System.out.println("El área del triángulo es " + areaTriangulo);
                            System.out.println();
                            break;

                        case 'B':
                            triangulo.mostrarDatos();
                            System.out.println();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Estamos trabajando con un círculo.");
                    System.out.println();
                    System.out.println("Introduce el tamaño del radio");

                    circulo = new Circulo(teclado.nextDouble());

                    System.out.println("¿Qué operación quieres hacer?");
                    System.out.println("A. Calcular área");
                    System.out.println("B. Calcular diámetro");
                    System.out.println("C. Mostrar datos");

                    char seleccion3 = Character.toUpperCase(teclado.next().charAt(0));

                    switch (seleccion3) {

                        case 'A':

                            circulo.calcularArea();
                            double areaCirculo = circulo.getArea();
                            System.out.println("El área del círculo es " + areaCirculo);
                            System.out.println();
                            break;

                        case 'B':
                            circulo.calcularDiametro();
                            double diametroCirculo = circulo.getDiametro();
                            System.out.println("El diámetro del círculo es " + diametroCirculo);
                            System.out.println();
                            break;

                        case 'C':
                            circulo.mostrarDatos();
                            System.out.println();
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Estamos trabajando con el cuadrado");
                    System.out.println();
                    System.out.println("Introduce el tamaño de la base");
                    int baseCuadrado = teclado.nextInt();
                    System.out.println("Introduce el tamaño de la altura");
                    int alturaCuadrado = teclado.nextInt();

                    cuadrado = new Cuadrado(baseCuadrado, alturaCuadrado);

                    System.out.println("¿Qué operación quieres hacer?");
                    System.out.println("A. Calcular área");
                    System.out.println("B. Calcular perímetro");
                    System.out.println("C. Mostrar datos");

                    char seleccion4 = Character.toUpperCase(teclado.next().charAt(0));

                    switch (seleccion4) {

                        case 'A':

                            cuadrado.calcularArea();
                            double areaCuadrado = cuadrado.getArea();
                            System.out.println("El área del cuadrado es "+areaCuadrado);
                            System.out.println();
                            break;

                        case 'B':
                            cuadrado.calcularPerimetro();
                            double perimetroCuadrado = cuadrado.getPerimetro();
                            System.out.println("El perímetro del cuadrado es " + perimetroCuadrado);
                            System.out.println();
                            break;

                        case 'C':
                            cuadrado.mostrarDatos();
                            System.out.println();
                            break;
                    }
                    break;

                case 4:
                    continue;


            }

            teclado.nextLine();
            System.out.println("Pulsa Enter para continuar");
            String enter = teclado.nextLine();

        } while (seleccion != 4);

        System.out.println("El programa ha finalizado");


    }

}
