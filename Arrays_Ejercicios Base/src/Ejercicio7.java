import java.util.Scanner;

public class Ejercicio7 {
    /*1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.

    Una vez hecho esto saldrá un menú que me dará las siguientes opciones:

    - Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[10];
        int opcion = 0;
        int numeroLetras = 0;

        System.out.println("Introduce 10 palabras");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = scanner.next();
        }

        do {
            System.out.println("1. Ver todas las palabras");
            System.out.println("2. Obtener una palabra al azar");
            System.out.println("3. Ver el número de letras total");
            System.out.println("4. Ver la media de letras entre todas las palabras");
            System.out.println("5. Ver la palabras con más letras");
            System.out.println("6. Ver la palabra con menos letras");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (String item : palabras) {
                        System.out.print(item + " ");
                    }
                    break;
                case 2:
                    int numeroAzar = (int) (Math.random() * 10);
                    System.out.println("Ha salido la palabra " + palabras[numeroAzar]);
                    break;
                case 3:
                    for (String item : palabras) {
                        numeroLetras += item.length();
                    }
                    System.out.printf("Hay %d letras\n", numeroLetras);
                    break;
                case 4:
                    System.out.println("La media de letras es " + (numeroLetras / palabras.length));
                    break;
                case 5:
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
                    System.out.println("La palabra más pequeña es "+palabraPequenia);
            }
        } while (opcion < 7 && opcion > 0);

        System.out.println("Programa finalizado.");

    }
}
