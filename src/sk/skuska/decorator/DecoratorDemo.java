package sk.skuska.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Postava postavicka = new Postavicka();
        postavicka.vypisCinnost();

        System.out.println("---------");

        Postava postavicka1 = new PuskaDecorator(new Postavicka());
        postavicka1.vypisCinnost();

        System.out.println("---------");

        Postava postavicka2 = new PuskaDecorator(new PeniazeDecorator(new MobilDecorator(new Postavicka())));
        postavicka2.vypisCinnost();
    }
}
