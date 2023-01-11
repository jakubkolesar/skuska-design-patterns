package sk.skuska.observer;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Client client = new Client();
        bankAccount.attach(client);

        Client client1 = new Client();
        bankAccount.attach(client1);

        bankAccount.credit(100);
        bankAccount.debit(1000);

    }
}
