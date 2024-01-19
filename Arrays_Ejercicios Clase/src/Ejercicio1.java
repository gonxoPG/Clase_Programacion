import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    /*1. (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos*/

    public static void main(String[] args) {
        int[] array = new int [5];
        int[] arrayMultiplicado = new int[5];
        int sumatorio = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 5 números para que sean guardados");

        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            arrayMultiplicado[i] = array[i]*2;
        }

        System.out.print("El doble de cada número introducido es ");
        for (int item:arrayMultiplicado) {
            System.out.print(item+" ");
        }


        for (int item :array) {
            sumatorio += item;
        }
        System.out.println("\nLa suma de todos los elementos es "+sumatorio);

        System.out.println("La media de todos los elementos es "+(sumatorio/5));

    }
}
