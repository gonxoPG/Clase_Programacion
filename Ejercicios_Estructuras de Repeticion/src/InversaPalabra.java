import java.util.Scanner;

public class InversaPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();

        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }
}
