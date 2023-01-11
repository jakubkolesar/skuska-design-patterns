package sk.skuska.strategy;

public class Robot {
    Strategy tool;

    public Robot() {
    }

    public void setTool(Strategy tool) {
        this.tool = tool;
    }

    public void work() {
        if (this.tool == null) {
            System.out.println("aint no tool");
        } else {
            this.tool.execute();
        }
    }


}
