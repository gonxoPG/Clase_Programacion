public class coloresANSI {

    public static void main(String[] args) {
        String ansiNegro = "\033[30m";
        String ansiRojo = "\033[31m";
        String ansiVerde = "\033[32m";
        String ansiAmarillo = "\033[33m";
        String ansiAzul = "\033[34m";
        String ansiMagenta = "\033[35m";
        String ansiCian = "\033[36m";
        String ansiBlanco = "\033[37m";
        String ansiReset = "\u001B[0m";
        System.out.print(ansiNegro + " negro " + ansiRojo + " rojo " + ansiVerde
                + " verde");
        System.out.print(ansiAmarillo + " amarillo " + ansiAzul + " azul" +
                ansiMagenta + " magenta");
        System.out.print(ansiCian + " cian" + ansiBlanco + " blanco " + ansiReset
                + "Hola Mundo!");
    }
}