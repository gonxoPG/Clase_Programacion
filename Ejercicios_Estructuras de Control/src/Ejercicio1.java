import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos números enteros");
        int entero1 = scanner.nextInt();
        int entero2 = scanner.nextInt();

        if (entero1 > entero2) {

            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }
    }
}