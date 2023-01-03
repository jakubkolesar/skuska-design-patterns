package sk.skuska.builder;

public class Postava {
    public String oblecenie, zbran, spravanie;
    public Postava(){

    }

    @Override
    public String toString() {
        return "Postava{" +
                "oblecenie='" + oblecenie + '\'' +
                ", zbran='" + zbran + '\'' +
                ", spravanie='" + spravanie + '\'' +
                '}';
    }
}
