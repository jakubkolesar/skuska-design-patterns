package sk.skuska.chain;

public class Veduci extends Zodpovedny {
    @Override
    public void handle(int price) {
        if (price < 5000) {
            System.out.println("Veduci schvaluje 😀");
        } else {
            super.handle(price);
        }
    }
}
