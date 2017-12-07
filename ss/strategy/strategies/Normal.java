package ss.strategy.strategies;

public class Normal implements Strategy {
    @Override
    public void handle() {
        System.out.println("it's a normal algorithm.");
    }
}
