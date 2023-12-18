import java.util.Scanner;

public class NumerosTipos {
    public static void main(String[] args) {

        int sumarioPositivos = 0;
        int sumarioNegativos = 0;

        int cantidadCeros = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número");
            int numIntroducido = scanner.nextInt();

            if (numIntroducido>0){
                sumarioPositivos+=numIntroducido;
                numerosPositivos++;
            }else{
                sumarioNegativos+=numIntroducido;
                numerosNegativos++;
            }

            if (numIntroducido == 0){

                cantidadCeros++;
            }
        }
        System.out.println("La media de los números positivos es "+(sumarioPositivos/numerosPositivos));
        System.out.println("La media de los números negativos es "+(sumarioNegativos/numerosNegativos));
        System.out.println("Hay "+cantidadCeros+" ceros");
    }
}
