package model;

public class Silla extends Mueble{
    private int patas;

    public Silla() {
    }

    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Patas = " + patas);
    }
}
