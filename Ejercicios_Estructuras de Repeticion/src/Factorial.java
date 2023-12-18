import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Introduce un número entre 0 y 20 para saber su factorial:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
