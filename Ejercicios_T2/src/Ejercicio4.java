public class Ejercicio4 {

    public static void main(String[] args) {

        int segundosTotal = 24973;

        float horasTotal = segundosTotal/3600f;

        System.out.println("Las horas son " +horasTotal +" horas");

        double restoHoras = segundosTotal%3600;
        // El resto es 3373.0

        int restoTotal = 3373; // segundos

        double minutosTotal = (double) 3373 /60;

        System.out.println("Los minutos son " +minutosTotal + " minutos");

        double restoMinutos = restoTotal%60;
        // El resto de los minutos es 13

        System.out.println("Los segundos son " +restoMinutos + " segundos");
    }
}
// FINZALIZADO