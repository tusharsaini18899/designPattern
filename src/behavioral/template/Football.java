package behavioral.template;

public class Football extends Game {
    @Override
    void startGame() {
        System.out.println("Start Playing Football");
    }

    @Override
    void playGame() {
        System.out.println("Playing Football");
    }

    @Override
    void endGame() {
        System.out.println("End playing Football");
    }
}
