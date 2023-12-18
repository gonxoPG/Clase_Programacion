public class TablaPedidos {
    public static void main(String[] args) {

        for (int i = 3; i < 8; i++) {
            System.out.println("Tabla de multiplicar del "+i);

            for (int j = 0; j <= 10; j++) {

                //System.out.printf("\t%d * %d = %d\n",i,j,i*j);
                System.out.printf("\t%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
