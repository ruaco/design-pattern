package ss.strategy.strategies;

public class Simple implements Strategy {
    @Override
    public void handle() {
        System.out.println("it's a simple algorithm.");
    }
}
