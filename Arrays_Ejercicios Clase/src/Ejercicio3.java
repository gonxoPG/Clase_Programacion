import java.util.Scanner;

public class Ejercicio3 {
    /*3. (SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPosiciones = 0;

        System.out.println("¿Cuántas posiciones tendran los arrays?");
        numeroPosiciones = scanner.nextInt();

        int[] arrayUno = new int[numeroPosiciones];
        int[] arrayDos = new int[numeroPosiciones];

        System.out.printf("Los arrays tienen %d posiciones\n", numeroPosiciones);

        System.out.println("Rellena las posiciones del primer array");
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = scanner.nextInt();
        }

        System.out.println("Rellena las posiciones del segundo array");
        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i] = scanner.nextInt();
        }

        int[] sumaArrays = new int[numeroPosiciones];

        /*for (int i = 0; i < arrayUno.length; i++) {
            sumaArrays[i] = arrayUno[i];
        }

        for (int i = 0; i < arrayDos.length; i++) {
            sumaArrays[i] += arrayDos[i];
        }*/

        //¿se podría reducir el código de estos dos for?

        for (int i = 0; i < sumaArrays.length; i++) {
            sumaArrays [i] = arrayUno[i]+arrayDos[i];
        }

        for (int i = 0; i < sumaArrays.length; i++) {
            System.out.printf("La suma de la posición %d es %d\n",i,sumaArrays[i]);
        }
        }
    }