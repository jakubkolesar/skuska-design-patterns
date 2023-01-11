package sk.skuska.observer;

import java.util.LinkedList;
import java.util.List;

public class BankAccount implements Subject {
    private List<Observer> observers;
    private int amount;

    public BankAccount() {
        observers = new LinkedList<>();
        this.amount = 0;
    }

    public void credit(int credit) {
        this.amount += credit;
        notif();
    }

    public void debit(int credit) {
        this.amount -= credit;
        notif();
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notif() {
        for (Observer ob : observers) {
            ob.update(this);
        }
    }
}
