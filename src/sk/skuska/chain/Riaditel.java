package sk.skuska.chain;

public class Riaditel extends Zodpovedny {
    @Override
    public void handle(int price) {
        if (price >= 5000 && price < 10000) {
            System.out.println("Riaditel 😑 schvaluje");
        } else {
            super.handle(price);
        }
    }
}
