public class MayorNumero {

    public static void main(String[] args) {

        int aleatorio;
        int maximo = 0;

        do {
            aleatorio = (int)(Math.random()*101);

            System.out.println(aleatorio);

            if (aleatorio>maximo) {
                maximo = aleatorio;
            }
        } while (aleatorio!=0);

        System.out.println("El máximo generado es "+maximo);
    }
}
