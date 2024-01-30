import java.util.Scanner;

public class Solucion1 {

    public static int calculasuma (int num, int tam){

        int suma = 0;

        for (int i=1; i<=num; i++){
            suma += i;
        }
        return suma /= tam;
    }
    public static int[][] rellenacuadrado (int num, int tam, int suma){
        /* Nos creamos un array auxiliar para comprobar que los elementos no estén duplicados*/
        int[] arraux = new int[num + 1];

        /*Creamos el cuadrado que va a contener el cuadrado mágico según el tamaño indicado*/
        int[][] result = new int[tam][tam];
        int nrand;
        int sum = 0;
        boolean valido = true;

        for (int i=0;i< result.length;i++){
            for (int j=0;j< result.length;j++) {
                /*Generamos el número y comprobamos si ya está en nuestro array auxiliar, si no lo está lo guardamos*/
                //int[] novalido = arraux;
                // do {
                valido = true;
                //sum = 0;
                do {
                    nrand = (int) (Math.random() * num) + 1;
                } while (arraux[nrand] != 0);

                   /* System.out.println(nrand);
                    dibujacuadrado(result);

                    for (int k=0;k< result.length;k++){
                        sum += result[i][k];
                        System.out.println(sum);
                        if((sum+nrand)>suma){
                            valido = false;
                            novalido[nrand] = nrand;
                            break;
                        }
                    }*/

                //    System.out.println(sum);
                // } while (!valido);

                /*Indicamos que número ha salido*/
                arraux[nrand] = nrand;

                /*guardamos el número generado en el cuadrado*/
                result[i][j] = nrand;
            }
        }

        return result;
    }
    public static boolean compruebacuadrado (int[][] cuadrado, int suma){
        boolean esmagico = true;
        int sumafila = 0;

        /*Comprobamos las filas*/
        for (int i=0;i<cuadrado.length;i++){
            sumafila = 0;
            for (int j=0; j< cuadrado.length; j++){
                sumafila += cuadrado[i][j];
            }
            if (suma != sumafila){
                esmagico = false;
                break;
            }
        }

        /*Si alguna de las filas no suma el valor no comprobamos las columnas*/
        if (esmagico){
            /*Comprobamos las columnas*/
            for (int i=0;i<cuadrado.length;i++){
                sumafila = 0;
                for (int j=0; j< cuadrado.length; j++){
                    sumafila += cuadrado[j][i];
                }
                if (suma != sumafila){
                    esmagico = false;
                    break;
                }
            }
        }

        /*Si alguna de las columnas no suma el valor no comprobamos la primera diagonal*/
        if (esmagico){
            /*Comprobamos la primera diagonal*/
            sumafila = 0;
            for (int i=0;i<cuadrado.length;i++){
                sumafila += cuadrado[i][i];
            }
            if (suma != sumafila){
                esmagico = false;
            }
        }

        /*Si la primera diagonal no suma el valor no comprobamos la segunda*/
        if (esmagico){
            /*Comprobamos la segunda diagonal*/
            sumafila = 0;
            for (int i=0;i<cuadrado.length;i++){
                sumafila += cuadrado[i][(cuadrado.length-1)-i];
            }
            if (suma != sumafila){
                esmagico = false;
            }
        }

        return esmagico;
    }
    public static void dibujacuadrado (int[][] cuadrado){
        for (int i=0;i< cuadrado.length;i++){
            for (int j=0;j< cuadrado.length;j++){
                System.out.print(cuadrado[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){

        Scanner reader = new Scanner(System.in);

        System.out.println("De que tamaño desea generar el cuadrado mágico");
        int tam = reader.nextInt();

        /*Calculamos cuantos números que van a componer nuesro cuadrado mágico*/
        int num = tam * tam;

        int[][] result;
        int suma = 0;

        do {
            /*Calculamos la suma que debe tener cada fila, columna o diagonal*/
            suma = calculasuma(num, tam);
            result = rellenacuadrado(num, tam,suma);
            dibujacuadrado(result);
            System.out.println("-----------------------------");

        } while(!compruebacuadrado(result,suma));


    }
}
