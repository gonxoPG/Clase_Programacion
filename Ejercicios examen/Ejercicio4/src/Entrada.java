import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aleatorio = (int) ((Math.random()*4001)+1000);
        int digitos;
        int intentos = 5;
        // boolean apertura -> para controlar el bloqueo y sacarlo por consola después del while

        System.out.println(aleatorio);

        do {
            System.out.println("Introduce 4 dígitos para poder abrir la caja: ");
            digitos = sc.nextInt();
            intentos--;

            if (digitos == aleatorio){
                System.out.println("¡Enhorabuena, has abierto la caja!");
                break;
            }else {
                System.out.printf("Error, te quedan %d intentos\n", intentos);
            }

        }while (intentos>0);

        if(intentos == 0){
            System.out.println("Caja bloqueada, has perdido la oportunidad");
        }
    }
}
