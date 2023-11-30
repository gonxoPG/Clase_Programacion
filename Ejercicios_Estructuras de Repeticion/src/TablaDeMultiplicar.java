import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {

        System.out.println("Introduce un número para saber su tabla de multiplicación");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i=0;i<11;i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);
        }
    }
}
