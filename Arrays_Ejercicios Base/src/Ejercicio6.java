public class Ejercicio6 {
    /*2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.

    Una vez hecho esto realizará las siguientes operaciones:
    - modificar todos los 6 por 8
    - modificar todos los 7 por 15
    - modificar todos los 20 por 10

    Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.*/

    public static void main(String[] args) {
        int[] aleatorios = new int[20];
        int modificaciones = 0;

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * 31);
        }

        for (int item : aleatorios) { // aquí Borja utiliza un método y lo llama cada vez que quiere imprimir el Array
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = 0; i < aleatorios.length; i++) {

            if (aleatorios[i] == 6) {
                aleatorios[i] = 8;
                modificaciones++;
            }
        }

        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] == 7){
                aleatorios[i] = 15;
                modificaciones++;
            }
        }

        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] == 20){
                aleatorios[i] = 10;
                modificaciones++;
            }
        }

        for (int item: aleatorios) {
            System.out.print(item+" ");
        }

        System.out.println("\nEl número de modificaciones es "+modificaciones);
    }
}
