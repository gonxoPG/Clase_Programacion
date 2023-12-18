import java.util.Scanner;

public class CapicuaPalabra {
    public static void main(String[] args) {

        System.out.println("Introduce una palabra para saber si es un palíndromo");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        boolean palindromo = false;

        for (int i = 0; i < palabra.length() / 2; i++) { // no termino de entender el /2
            if (palabra.charAt(i) == palabra.charAt(palabra.length() - 1 - i)) { // no termino de entender el -1 - i
                palindromo = true;
            } else {
                palindromo = false;
                break;
            }

        }
        if (palindromo) {
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra no es un palíndromo");
        }
    }
}