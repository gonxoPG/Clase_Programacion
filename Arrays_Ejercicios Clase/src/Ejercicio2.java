import java.util.Scanner;

public class Ejercicio2 {

    /*2. (MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas posiciones quieres que tenga el array?");
        int posiciones = scanner.nextInt();

        int[] arrayEnteros = new int[posiciones];

        System.out.println("Ahora rellena las posiciones con los números que tu quieras");

        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = scanner.nextInt();
        }

        System.out.println("Estos son los números introducidos");
        for (int item : arrayEnteros) {
            System.out.print(item + " ");
        }

        int numeroMayor = arrayEnteros[0];
        for (int item : arrayEnteros) {
            if (item > numeroMayor) {
                numeroMayor = item;
            }
        }
        System.out.println("\nEl mayor número es el " + numeroMayor);

        int numeroMenor = arrayEnteros[0];
        for (int item : arrayEnteros) {
            if (item < numeroMenor) {
                numeroMenor = item;
            }
        }
        System.out.println("El menor número es el " + numeroMenor);

    }
        /*case 5:
                    String palabraGrande = palabras[0];
                    for (String item : palabras) {
                        if (item.length() > palabraGrande.length()) {
                            palabraGrande = item;
                        }
                    }
                    System.out.println("La palabra más grande es "+palabraGrande);
                    break;
                case 6:
                    String palabraPequenia = palabras[0];
                    for (String item : palabras) {
                        if (item.length() < palabraPequenia.length()) ;
                        palabraPequenia = item;
                    }
                    System.out.println("La palabra más pequeña es "+palabraPequenia);*/
}
