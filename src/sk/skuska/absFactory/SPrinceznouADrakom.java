package sk.skuska.absFactory;

public class SPrinceznouADrakom implements Factory{
    @Override
    public Postava vytvorPostavicku() {
        return new Princezna();
    }

    @Override
    public Zviera vytvorZvieratko() {
        return new Drak();
    }
}
