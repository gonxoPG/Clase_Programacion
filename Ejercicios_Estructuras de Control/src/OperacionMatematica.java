import java.util.Scanner;

public class OperacionMatematica {
    public static void main(String[] args) {
        System.out.println("Elige una operación a realizar (+, -, * o /)");
        Scanner scanner = new Scanner(System.in);
        String operacion = scanner.next();
        System.out.println("Ahora escoge dos números para la operación");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        switch (operacion){

            case "+":
                System.out.println("El resultado es "+numero1+numero2);
                break;
            case "-":
                System.out.println("El resultado es "+(numero1-numero2));
                break;
            case "*":
                System.out.println("El resultado es "+numero1*numero2);
                break;
            case "/":
                System.out.println("El resultado es "+numero1/numero2);
                break;
            default:
                System.out.println("Operación no contemplada");

        }

    }
}
