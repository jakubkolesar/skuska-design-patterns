package sk.skuska.decorator;

public class PuskaDecorator extends PostavaDecorator{
    public PuskaDecorator(Postava postava) {
        super(postava);
    }

    @Override
    public void vypisCinnost() {
        System.out.println("Mozem strielat");
        super.vypisCinnost();
    }
}
