package sk.skuska.chain;

public class President extends Zodpovedny {
    @Override
    public void handle(int price) {
        if (price >= 30000) {
            System.out.println("President 😡 schvaluje");
        } else {
            super.handle(price);
        }
    }
}
