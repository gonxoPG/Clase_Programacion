import controller.Centralita;
import controller.Llamada;
import model.Local;
import model.Nacional;
import model.Provincial;

public class Entrada {
    public static void main(String[] args) {
        Centralita centralita = new Centralita();
        Llamada llamada;
        centralita.registrarLlamadas(new Local(6123, 6321, 100));
        centralita.registrarLlamadas(new Provincial(6789, 6987, 200));
        centralita.registrarLlamadas(new Nacional(6547, 6854, 150));
        centralita.mostrarLlamadas();
        centralita.mostrarCostesTotales();
    }
}
