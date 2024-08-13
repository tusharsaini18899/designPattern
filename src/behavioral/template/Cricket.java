package behavioral.template;

public class Cricket extends Game {
    @Override
    void startGame() {
        System.out.println("Start Playing Cricket");
    }

    @Override
    void playGame() {
        System.out.println("Playing Cricket");
    }

    @Override
    void endGame() {
        System.out.println("End playing Cricket");
    }
}
