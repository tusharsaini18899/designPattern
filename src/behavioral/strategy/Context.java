package behavioral.strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int n1, int n2) {
        return strategy.doOperation(n1, n2);
    }
}
