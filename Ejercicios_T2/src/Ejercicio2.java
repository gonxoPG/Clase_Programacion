import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner numerosEnteros = new Scanner(System.in);

        System.out.println("Introduce el numero 1");
        int numero1 = numerosEnteros.nextInt();
        System.out.println("Introduce en numero 2");
        int numero2 = numerosEnteros.nextInt();
        System.out.println("Introduce el numero 3");
        int numero3 = numerosEnteros.nextInt();
        System.out.println("Introduce el numero 4");
        int numero4 = numerosEnteros.nextInt();
        System.out.println("Introduce el numero 5");
        int numero5 = numerosEnteros.nextInt();

        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        // 1 2 3 4 5

        int aux = numero1;
        // solo lo declaro la priemra vez, luego modifico

        numero1 = numero2;
        numero2 = numero3;
        numero3 = numero4;
        numero4 = numero5;
        numero5 = aux;

        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        // 2 3 4 5 1

        aux = numero5;

        numero5 = numero4;
        numero4=numero3;
        numero3=numero2;
        numero2=numero1;
        numero1= aux;

        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        // 1 2 3 4 5
    }
}

//No hacía falta introducir lectura de teclado, solo declarar variables enteras