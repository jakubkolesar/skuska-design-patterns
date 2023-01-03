package sk.skuska.decorator;

public class PostavaDecorator implements Postava{
    private Postava postavicka;

    public PostavaDecorator(Postava postava){
        this.postavicka = postava;
    }
    @Override
    public void vypisCinnost() {
        postavicka.vypisCinnost();
    }
}
