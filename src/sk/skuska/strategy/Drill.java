package sk.skuska.strategy;

public class Drill implements Strategy{
    @Override
    public void execute() {
        System.out.println("DRILLING");
    }
}
