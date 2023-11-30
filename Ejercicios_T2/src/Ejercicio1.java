public class Ejercicio1 {

    public static void main(String[] args) {

        String nombreCompleto = "Gonzalo Pastor Gomez"; //Falta convertirla en constante (final)
        String direccionCalle = "C/ Mayor nª"; //Falta convertirla en constante (final)
        int numeroPortal = 7; //se podría incluir dentro del anterior String
        int piso = 1; //ídem
        char letraPiso = 'A'; //ídem
        int codigoPostal = 28025;
        String localidad = "Madrid";
        String provincia = "Madrid";
        String pais = "España";

        System.out.println(nombreCompleto);
        System.out.println(direccionCalle + numeroPortal + ", " + piso + letraPiso); /*al introducir más datos dentro
                                                                                      *de un único String no haría falta
                                                                                      *tanta concadenación*/
        System.out.println(codigoPostal + " " + provincia);
        System.out.println(pais);
    }
}