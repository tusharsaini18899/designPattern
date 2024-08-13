package behavioral.template;

public abstract class Game {
    abstract void startGame();

    abstract void playGame();

    abstract void endGame();

    public final void play() {
        startGame();
        playGame();
        endGame();
    }
}
