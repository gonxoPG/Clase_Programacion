import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    /*1. (InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible. Para ello el programa debe:
- pedir el número de participantes (de ser impar saltará un fallo)
- pedir el nombre de cada uno de los participantes
- sacar por pantalla el orden de las parejas resultantes*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos participantes sois?");

        String[] participantes = new String[scanner.nextInt()];

        System.out.println("Introduce el nombre de cada participante");

        for (int i = 0; i < participantes.length; i++) {
            participantes[i] = scanner.next();
         }

        int[] sorteo = new int[participantes.length];

        for (int i = 0; i < participantes.length; i++) {
            int aleatorio1, aleatorio2;

            do {
                aleatorio1 = (int) (Math.random()* (participantes.length));

            }while (participantes[aleatorio1]==null);

                do {
                    aleatorio2 = (int) (Math.random()*(participantes.length));
                    
                }while (participantes[aleatorio2]==null);

                String nombre1 = participantes[aleatorio1];
                String nombre2 = participantes[aleatorio2];

            System.out.println(nombre1+" regala a "+nombre2);

            participantes[aleatorio1]=null;
            participantes[aleatorio2]=null;
        }
    }
}
