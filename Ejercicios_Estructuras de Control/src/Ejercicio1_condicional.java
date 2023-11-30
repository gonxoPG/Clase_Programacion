import java.util.Scanner;

public class Ejercicio1_condicional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos números enteros");
        int entero1 = scanner.nextInt();
        int entero2 = scanner.nextInt();

        System.out.println(entero1>entero2 ? "El primero es mayor que el segundo" : "El primero no es mayor que el segundo");
    }
}