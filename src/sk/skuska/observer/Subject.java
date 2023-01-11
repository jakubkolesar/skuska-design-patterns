package sk.skuska.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notif();
}
