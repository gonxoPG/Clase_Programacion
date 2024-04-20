import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("01A55B", 10000);
        Scanner teclado = new Scanner(System.in);
        double cantidad = 0;

        try {
            System.out.println("Introduce la cantidad que quieres transferir:");
            cantidad = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error en el proceso");
        }

        try {
            cuenta.realizarTransaccion(cantidad);
        } catch (SaldoInsuficienteExcepcion miExcepcion) {
            System.out.println(miExcepcion.getMessage());
        }catch (IllegalArgumentException e2){
            System.out.println("La cantidad debe ser positiva");
        }finally {
            System.out.println("El saldo es "+cuenta.getSaldo());
        }

    }
}
