package sk.skuska.decorator;

public class MobilDecorator extends PostavaDecorator{
    public MobilDecorator(Postava postava) {
        super(postava);
    }

    @Override
    public void vypisCinnost() {
        System.out.println("Mozem telefonovat");
        super.vypisCinnost();
    }
}
