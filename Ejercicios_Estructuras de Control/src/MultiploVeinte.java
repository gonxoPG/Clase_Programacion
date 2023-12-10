import java.util.Scanner;

public class MultiploVeinte {
    public static void main(String[] args) {
        System.out.println("Introduce un número para comprobar si es múltiplo de 20 y se encuentra entre -100 y 100");
        Scanner scanner = new Scanner(System.in);
        int numeroEntero = scanner.nextInt();

        if (numeroEntero % 20 == 0) {

            if (numeroEntero >= -100 && numeroEntero <= 100) {
                System.out.println("Es múltiplo de 20 y está entre -100 y 100");
            } else {
                System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
            }
        } else {

            if (numeroEntero >= -100 && numeroEntero <= 100) {
                System.out.println("No es múltiplo de 20 y está entre -100 y 100");
            } else {
                System.out.println("No es múltiplo de 20 y tampoco está entre -100 y 100");
            }
        }
    }
}
