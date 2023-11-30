public class TablaTodos {

    public static void main(String[] args) {

        int numero = 0;

        for (int i=0;i<=10;i++) {

            System.out.println("Tabla de multiplicar del "+i);

            for (int j = 0; j <= 10; j++) {

                System.out.printf("\t%d * %d = %d\n",i,j,i*j);

            }
        }
    }
}
