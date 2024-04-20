package model;

public class Carne extends Alimento{
    private int proteinas;

    public Carne() {
    }

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Proteínas = " + proteinas);
    }

}
