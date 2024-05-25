import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, apellido, sexo;
        int edad;
        double altura, peso, IMC;

        System.out.println("Introduce tu nombre, apellido, edad, sexo (M/F), altura (metros) y peso (Kg): ");
        nombre = sc.next();
        apellido = sc.next();
        edad = sc.nextInt();
        sexo = sc.next();
        altura = sc.nextDouble();
        peso = sc.nextDouble();

        IMC = calculoIMC(peso, altura);

        System.out.printf("Hola %s tu IMC teniendo en cuenta tu altura de %.2f m y tu peso de %.2f Kg, tiene un valor de %.2f", nombre, altura, peso, IMC);
    }

    public static double calculoIMC(double peso, double altura) {

        double IMC = peso/Math.pow(altura,2);

        return IMC;
    }
}
