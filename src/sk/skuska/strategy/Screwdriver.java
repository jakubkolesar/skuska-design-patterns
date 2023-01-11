package sk.skuska.strategy;

public class Screwdriver implements Strategy{
    @Override
    public void execute() {
        System.out.println("SCREWDRIWING");
    }
}
