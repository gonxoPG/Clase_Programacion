import java.util.Scanner;

public class Ejercicio1 {
    /*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
    A continuación se mostrará el contenido de ese array junto al índice (0 – 9)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce diez números");

        int[] almacen = new int[10];

        for (int i = 0; i < almacen.length; i++) {

            almacen[i] = scanner.nextInt();


        }

       for (int i = 0; i < almacen.length; i++) {

            System.out.printf("En la posición %d está el número %d\n",i,almacen[i]);
        }
    }
}
