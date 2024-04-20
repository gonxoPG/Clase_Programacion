import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numerosUsuario = new int[5];
        int[] numerosAleatorios = new int[5];
        int aciertos = 0;

        System.out.println("Introduce 5 números para comprobar si están:");

        for (int i = 0; i < numerosUsuario.length; i++) {
            numerosUsuario[i] = teclado.nextInt();
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) ((Math.random()*9)+1);
        }

        System.out.println("Los números que ha elegido el usuario son los siguientes: ");
        for (int item : numerosUsuario){
            System.out.print(item+" ");
        }
        System.out.println();

        System.out.println("Los números que ha salido son los siguientes:");
        for (int item : numerosAleatorios){
            System.out.print(item+" ");
        }
        System.out.println();

        for (int itemUno : numerosAleatorios){
            for (int itemDos: numerosUsuario){
                if (itemUno == itemDos){
                    aciertos +=1;
                }
            }
        }

        System.out.println("El número de aciertos es "+aciertos);
    }
}
