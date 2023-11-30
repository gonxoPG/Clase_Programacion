import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        int[] carton = new int[10];
        int numalCarton;
        int apuesta = 0;
        int numVueltas = 0;
        int numAciertos = 0;
        int salidosLinea = 0;
        int salidosBingo = 0;

        for (int i = 0; i < 10; i++) {

            boolean repetido = false;

            do {

                numalCarton = (int) (Math.random() * 99) + 1;

                for (int recorrido : carton) {

                    if (numalCarton == recorrido) {

                        repetido = true;


                    } else {
                        repetido = false;
                    }

                }
            } while (repetido);

            carton[i] = numalCarton;

            System.out.print(carton[i] + " ");
        }

        System.out.println();
        System.out.println("Introduce tu apuesta");

        Scanner scanner = new Scanner(System.in);
        apuesta = scanner.nextInt();

        System.out.println("Tu apuesta es " + apuesta + "€");
        System.out.println();
        System.out.println("¿Cuántas bolas harán falta para cantar el Bingo?");

        Scanner scanner2 = new Scanner(System.in);
        int cantidadAcierto = scanner2.nextInt();

        System.out.println("La cantidad introducida es " + cantidadAcierto + "\n");

        int[] bolas = new int[99];
        int numalBolas;

        for (int j = 0; j < bolas.length; j++) {

            boolean repetido2 = false;

            do {

                numalBolas = (int) (Math.random() * 99) + 1;


                for (int recorridoBolas : bolas) {

                    if (numalBolas == recorridoBolas) {

                        repetido2 = true;


                    } else {
                        repetido2 = false;
                    }
                }
                numVueltas++;
            } while (repetido2);

            for (int recorrido : carton) {


                if (numalBolas == recorrido) {

                    numAciertos++;

                }

                if (numAciertos == 5) {
                    System.out.println("¡Han cantado Línea!");
                    salidosLinea = recorrido;
                }

                numAciertos++;

                if (numAciertos == 10) {

                    System.out.println("¡Han cantado Bingo!");
                    salidosBingo = recorrido;
                    break;
                }
            }

            bolas[j] = numalBolas;
        }

        System.out.println();
        System.out.println("El número de bolas sacadas es " + numVueltas + "\n"); // siempre sale 99, no sé dónde está el problema, aunque lo he ido moviendo dentro del código
        System.out.println("La Línea salió en la bola " + salidosLinea + "\n"); // no debe de estar bien porque a veces el número que sale es más alto que el del Bingo
        System.out.println("El Bingo salió en la bola " + salidosBingo + "\n");

        if (numVueltas == apuesta) {
            System.out.println("¡Has ganado " + apuesta * 10 + "€ por tu acierto!");
        } else {
            System.out.println("La apuesta no ha sido premiada");
        }
    }
}