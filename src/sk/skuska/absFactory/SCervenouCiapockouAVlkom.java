package sk.skuska.absFactory;

public class SCervenouCiapockouAVlkom implements Factory{
    @Override
    public Postava vytvorPostavicku() {
        return new CervenaCiapocka();
    }

    @Override
    public Zviera vytvorZvieratko() {
        return new Vlk();
    }
}
