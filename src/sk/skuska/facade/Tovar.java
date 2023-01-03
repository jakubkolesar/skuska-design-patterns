package sk.skuska.facade;

public class Tovar {
    private String nazov;
    private int cena;

    public Tovar(String nazov, int cena) {
        this.nazov = nazov;
        this.cena = cena;
    }

    public String getNazov() {
        return nazov;
    }

    public int getCena() {
        return cena;
    }
}
