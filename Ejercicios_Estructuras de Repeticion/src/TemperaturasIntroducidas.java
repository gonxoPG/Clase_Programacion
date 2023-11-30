import java.util.Scanner;

public class TemperaturasIntroducidas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce de cuántas temperaturas quieres saber la media");
        int tempIntroducidas = scanner.nextInt();

        double tempMedia = 0.0;
        double sumatorio = 0.0;

        for (int i = 0 ; i < tempIntroducidas ; i++);{

            System.out.println("Introduce una temperatura");
            int temperatura = scanner.nextInt();
            if (temperatura < 1) {
                temperatura = 10;
            }
            sumatorio+=temperatura;
        }
            System.out.printf("La media de la temperatura es de %.2f",+sumatorio/tempIntroducidas);
    }
}
