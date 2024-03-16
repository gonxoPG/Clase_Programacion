import model.Agenda;
import model.Persona;

public class Entrada {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("Vicente", "Romero", "123456789A", 602436754));

        agenda.mostrarPersonasAgenda();
    }
}
