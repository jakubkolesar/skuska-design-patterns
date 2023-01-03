package sk.skuska.chain;

public interface Handler {
    public void setNext(Handler nextHandler);
    public void handle(int price);
}
