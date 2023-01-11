package sk.skuska.strategy;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.work();

        robot.setTool(new Screwdriver());
        robot.work();

    }
}
