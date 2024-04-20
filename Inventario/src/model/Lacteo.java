package model;

public class Lacteo extends Alimento {
    private int volumen;

    public Lacteo() {
    }

    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Volumen = " + volumen);
    }
}
