import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 10);
        int intento;
        int vueltas = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Intenta acertar un número aleatorio entre 0 y 100");
            intento = scanner.nextInt();

            if (intento != aleatorio) {
                System.out.println("Lo siento, inténtalo de nuevo\n");
            }
            vueltas++;
        } while (intento != aleatorio);
            System.out.println("¡Enhorabuena! Has acertado el número en " + vueltas + " intentos");
    }
}
