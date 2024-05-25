import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] notas = new Integer[5];
        int nota;
        int notaMax = 0;
        int notaMin = 10;
        int aprobados = 0;
        int suspensos = 0;
        double notaMedia = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce las notas: ");
            nota = sc.nextInt();
            notas[i] = nota;
            notaMedia += nota;
        }

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > notaMax){
                notaMax = notas[i];
            }

            if (notas[i] < notaMin){
                notaMin = notas[i];
            }

            if (notas[i] >= 5){
                aprobados++;
            }else if (notas[i] < 5){
                suspensos++;
            }else {
                System.out.println("Nota introducia no válida");
            }
        }

        // Arrays.sort(notas);
        notaMedia = notaMedia/5;

        System.out.println("La nota más alta obtenida es "+notaMax);
        System.out.println("La nota más baja obtenida es "+notaMin);
        System.out.println("La cantidad de aprobados es "+aprobados);
        System.out.println("La cantidad de suspensos es "+suspensos);
        System.out.println("La nota media es "+notaMedia);
    }
}
