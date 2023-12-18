public class BaseExponente {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 4;
        int resultado =1; //si le pones 0 to-do lo multiplica por 0 (op1*op2)

        for (int i = 1; i <= exponente; i++) {

           resultado *= base;
        }
        System.out.println("El resultado de la potencia es "+resultado);
    }
}
