package sk.skuska.builder;

public class SedliakBuilder implements PostavaBuilder{
    private Postava postava = new Postava();

    @Override
    public Postava getPostava() {
        return this.postava;
    }

    @Override
    public PostavaBuilder pridajOblecenie() {
        this.postava.oblecenie = "platena kosela";
        return this;
    }

    @Override
    public PostavaBuilder pridajZbran() {
        this.postava.zbran = "motyka";
        return this;
    }

    @Override
    public PostavaBuilder pridajSpravanie() {
        this.postava.spravanie = "utekaj";
        return this;
    }
}
