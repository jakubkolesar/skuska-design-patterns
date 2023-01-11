package sk.skuska.observer;

public class Client implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Acc value: " + ((BankAccount) subject).getAmount());
    }
}
