import java.util.Scanner;

public class Ejercicio4 {
    /*4. (PosicionesArray) Crea una aplicación que:
    - pida por teclado la longitud de un array
    - cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
    - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas posiciones quieres que tenga el array");

        int[] array = new int[scanner.nextInt()];

        System.out.println("Introduce un número por cada posición del array?");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("El array contiene los siguientes números ");
        for (int item : array) {
            System.out.print(item + " ");
        }

        int aux = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = aux;

        System.out.println("\nSi lo desplazamos a la derecha queda así ");
        for (int item : array) {
            System.out.print(item + " ");
        }

        aux = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];

        }
        array[array.length - 1] = aux;

        aux = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = aux;

        System.out.println("\nSi lo desplazamos a la izquierda queda así ");
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
