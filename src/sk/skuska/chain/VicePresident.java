package sk.skuska.chain;

public class VicePresident extends Zodpovedny {
    @Override
    public void handle(int price) {
        if (price >= 10000 && price < 30000) {
            System.out.println("VicePresident 😂 schvaluje");
        } else {
            super.handle(price);
        }
    }
}
