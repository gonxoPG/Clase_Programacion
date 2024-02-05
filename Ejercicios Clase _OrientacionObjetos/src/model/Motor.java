package model;

public class Motor {
    private int litrosAceite, CV;

    public Motor (){}

    public Motor(int CV) {
        this.CV = CV;
        litrosAceite = 0;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCV() {
        return CV;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite += litrosAceite;
    }
}
