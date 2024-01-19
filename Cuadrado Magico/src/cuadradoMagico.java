import java.util.Scanner;

public class cuadradoMagico {

    static int[][] cuadradoMagico = new int[0][0];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a crear un Cuadrado Mágico");
        System.out.println("¿Cuántas posiciones de ancho y de alto quieres que tenga?");

        cuadradoMagico = new int[scanner.nextInt()][scanner.nextInt()];

        System.out.println("Ahora vamos a rellenar las posiciones");

        do {

            rellenarCuadrado();

            for (int i = 0; i < cuadradoMagico.length; i++) {
                sumaAuxiliar = 0;
                for (int j = 0; j < cuadradoMagico[i].length; j++) {
                    if (i == 0) {
                        sumaMagica += cuadradoMagico[i][j];
                    } else {
                        sumaAuxiliar += cuadradoMagico[i][j];
                    }
                }

                if (sumaAuxiliar != sumaMagica) {
                    esMagico = false;
                    break;
                }
            }
            //rellenar columnas
            // rellenar diagonales [i][i]
            //[0][2]
            //[1][1]
            //[2][0]

        }while (!esMagico);

        imprimirCuadrado();
    }

    public static void rellenarCuadrado(){
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {

                int aleatorio;

                do {
                    aleatorio = (int) (Math.random() * 11);

                } while (estaNumero(aleatorio));

                cuadradoMagico[i][j] = aleatorio;
            }
        }
    }
    public static void imprimirCuadrado() {
        for (int[] fila : cuadradoMagico) {
            for (int item : fila) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static boolean estaNumero(int numero) {
        for (int[] fila : cuadradoMagico) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean esMagico = true;

    static int sumaMagica = 0, sumaAuxiliar = 0;
}
