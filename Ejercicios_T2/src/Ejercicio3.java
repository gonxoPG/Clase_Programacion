public class Ejercicio3 {

    public static void main(String[] args) {

        int op1 = 10; //en este ejericio no se declaraba la variable, sino que se pedía por teclado
        int op2 = 5;

        int suma = op1 + op2;/*no declaro una variable con una operación,
                              *sino que ejecuto la operación en la misma impresión*/
        int resta = op1 - op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;
        int resto = op1 % op2;

        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resutlado de la resta es " + resta);
        System.out.println("El resultado de la mutiplicacion es " + multiplicacion);
        System.out.println("El resultado de la division es " + division);
        System.out.println("El resultado del resto es " + resto);
    }
}

// FINALIZADO