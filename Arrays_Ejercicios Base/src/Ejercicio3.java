import java.util.Scanner;

public class Ejercicio3 {

    /*3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:

    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Introduce 10 números");

        for (int i = 0; i < numeros.length; i++) {

            numeros[i]= scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {

            System.out.print(numeros[i]+" ");
        }

        System.out.println();

        for (int normal :numeros) {
            System.out.print(normal+" ");
        }
    }
}
