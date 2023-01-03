package sk.skuska.decorator;

public class PeniazeDecorator extends PostavaDecorator{
    public PeniazeDecorator(Postava postava) {
        super(postava);
    }
    @Override
    public void vypisCinnost() {
        System.out.println("Mozem nakupovat");
        super.vypisCinnost();
    }

}
