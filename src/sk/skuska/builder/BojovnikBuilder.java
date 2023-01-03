package sk.skuska.builder;

public class BojovnikBuilder implements PostavaBuilder{
    private Postava postava = new Postava();
    @Override
    public Postava getPostava() {
        return this.postava;
    }

    @Override
    public PostavaBuilder pridajOblecenie() {
        this.postava.oblecenie = "kruzkova kosela";
        return this;
    }

    @Override
    public PostavaBuilder pridajZbran() {
        this.postava.zbran = "mec";
        return this;
    }

    @Override
    public PostavaBuilder pridajSpravanie() {
        this.postava.spravanie = "bojuj";
        return this;
    }
}
