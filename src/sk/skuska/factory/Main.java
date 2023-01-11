package sk.skuska.factory;

public class Main {

    public static void main(String[] args) {

        // Play Game
        Game game = new Game();
        game.play();

        // Play AdvancedGame
        Game advancedGame = new AdvancedGame();
        advancedGame.play();
    }
}
