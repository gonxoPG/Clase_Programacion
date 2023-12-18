import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random()*29)+1;
        int adivina = 0;
        Scanner scanner = new Scanner(System.in);

        //System.out.println(aleatorio);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Adivina el número aleatorio");
            adivina = scanner.nextInt();

            if (adivina == aleatorio){
                System.out.printf("Has adivinado el número en %d intentos\n", i);
                break;
            }

            if (i==10){
                System.out.println("Lo siento, has agotado todos los intentos");
            }
        }

    }
}
