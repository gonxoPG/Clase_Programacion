public class Ejercicio2 {
    /*2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.

    Una vez metidos, se deberá mostrar:
    - Numero de puntos obtenidos
    - Media de puntos obtenidos
    */

    public static void main(String[] args) {

        int[] aleatorios = new int[30];
        int acumulado = 0;

        for (int i = 0; i < aleatorios.length; i++) {

            aleatorios[i] = (int) (Math.random()*11);
        }

        for (int i = 0; i < aleatorios.length; i++) {

            System.out.print(aleatorios[i]+" ");

            acumulado += aleatorios[i];
        }

        System.out.println("\nEl número de puntos obtenidos es "+acumulado);
        System.out.println("La media de todos los puntos es "+(acumulado/30));
    }
}
