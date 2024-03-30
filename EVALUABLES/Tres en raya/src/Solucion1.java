import java.util.Scanner;

public class Solucion1 {

    static int[][] tablero = new int[3][3];
    static boolean tresenraya = false;

    public static void imprimirtablero (int[][] tablero){
        System.out.println("  A B C");
        for (int i=0;i<tablero[0].length;i++){
            System.out.print(i+1);
            System.out.print(" ");
            for (int j=0;j<tablero[0].length;j++){
                switch (tablero[i][j]){
                    case 1: System.out.print("O");
                        break;
                    case 2: System.out.print("X");
                        break;
                    default: System.out.print(" ");
                }
                //System.out.print(tablero[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean validarjugada (String posicion, int jugador){

        int j = 0;
        switch (posicion.charAt(0)){
            case 'A':
                j = 0;
                break;
            case 'B':
                j = 1;
                break;
            case 'C':
                j = 2;
                break;
        }

        int i = Character.getNumericValue(posicion.charAt(1)) - 1;

        if (tablero[i][j] != 0){
            System.out.println("La posición está ocupada");
            return false;
        }
        else{
            if (jugador == 1){
                tablero[i][j] = 1;
            }
            else{
                tablero[i][j] = 2;
            }
            return true;
        }
    }

    public static boolean validatresenraya (int jugador){
        //Valida la primera fila
        if ((tablero[0][0] != 0) && (tablero[0][0] == tablero[0][1]) && (tablero[0][0] == tablero[0][2])){
            tresenraya = true;
        }

        //Valida la segunda fila
        if ((tablero[1][0] != 0) && (tablero[1][0] == tablero[1][1]) && (tablero[1][0] == tablero[1][2])){
            tresenraya = true;
        }

        //Valida la tercera fila
        if ((tablero[2][0] != 0) && (tablero[2][0] == tablero[2][1]) && (tablero[2][0] == tablero[2][2])){
            tresenraya = true;
        }

        //Valida la primera columna
        if ((tablero[0][0] != 0) && (tablero[0][0] == tablero[1][0]) && (tablero[0][0] == tablero[2][0])){
            tresenraya = true;
        }

        //Valida la segunda columna
        if ((tablero[0][1] != 0) && (tablero[0][1] == tablero[1][1]) && (tablero[0][1] == tablero[2][1])){
            tresenraya = true;
        }

        //Valida la tercera columna
        if ((tablero[0][2] != 0) && (tablero[0][2] == tablero[1][2]) && (tablero[0][2] == tablero[2][2])){
            tresenraya = true;
        }

        //Valida la primera diagonal
        if ((tablero[0][0] != 0) && (tablero[0][0] == tablero[1][1]) && (tablero[0][0] == tablero[2][2])){
            tresenraya = true;
        }

        //Valida la segunda diagonl
        if ((tablero[0][2] != 0) && (tablero[0][2] == tablero[1][1]) && (tablero[0][2] == tablero[2][0])){
            tresenraya = true;
        }

        if (tresenraya){
            System.out.println("Enhorabuena ha ganado el jugador " + jugador);
        }
        return tresenraya;
    }

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        String seguirjugando;

        do {
            //Reiniciamos las variables
            int cont = 0;
            int jugador = 1;
            for (int i=0;i<tablero[0].length;i++){
                for (int j=0;j<tablero[0].length;j++){
                    tablero[i][j] = 0;
                }
            }

            System.out.println("¿Jugamos al tres en raya?");
            imprimirtablero(tablero);

            do {
                String posicion;
                cont++;
                do {
                    System.out.println("Le toca al jugador " + jugador + ". Elija columna y fila");
                    posicion = reader.next();
                } while (!validarjugada(posicion, jugador)); //Estamos en la jugada hasta que las posiciones dadas sean válidas
                //Imprimimos el tablero después de cada jugada para ver como está
                imprimirtablero(tablero);
                //Comrpobamos si hay tres en raya después de cada jugada
                validatresenraya(jugador);
                //Intercalamos al jugador uno y al jugador dos
                if (jugador == 1) {
                    jugador++;
                } else {
                    jugador--;
                }
            } while ((!tresenraya) && cont != 9);

            if ((cont == 9) && (!tresenraya)) {
                System.out.println("Se ha producido un empate");
            }

            System.out.println("¿Deseais otra partida? (S/n)");
            seguirjugando = reader.next();

        } while (seguirjugando.equals("S"));
    }
}
