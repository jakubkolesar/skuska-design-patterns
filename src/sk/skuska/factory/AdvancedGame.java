package sk.skuska.factory;
public class AdvancedGame extends Game {

    @Override
    public Level createLevel() {
        return new AdvancedLevel();
    }
}
