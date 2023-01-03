package sk.skuska.facade;

public class Objednavka {
    private Dodavatel dodavatel;
    private Tovar tovar;
    int pocet;

    public Objednavka(Dodavatel dodavatel, Tovar tovar, int pocet) {
        this.dodavatel = dodavatel;
        this.tovar = tovar;
        this.pocet = pocet;
    }

    @Override
    public String toString() {
        return "Objednavka{" +
                "dodavatel=" + dodavatel.getNazov() +
                ", tovar=" + tovar.getNazov() +
                ", cena za kus="+ tovar.getCena()+"€"+
                ", pocet=" + pocet +
                '}';
    }

    public void objednaj(){
        System.out.println(toString());
    }

}
