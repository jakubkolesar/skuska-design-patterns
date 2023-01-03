package sk.skuska.chain;

public class Zodpovedny implements Handler{
    private Handler nextHandler;
    @Override
    public void setNext(Handler nextHandler) {
        if(this.nextHandler != null){
            this.nextHandler.setNext(nextHandler);
        }
        else this.nextHandler = nextHandler;
    }

    @Override
    public void handle(int price) {
        if(nextHandler != null){
            nextHandler.handle(price);
        }
    }
}


