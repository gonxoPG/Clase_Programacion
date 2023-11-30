import java.util.Scanner;

public class SumarPositivos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int entero = -1;
        int sumario = 0;

        do {
            System.out.println("Introduce un número que no sea el 0");
            entero = scanner.nextInt();
            if (entero > 0) {
                sumario += entero;
            }
        } while (entero != 0);

        System.out.println("La suma de todos los números positivos introducidos es " + sumario);
    }
}
