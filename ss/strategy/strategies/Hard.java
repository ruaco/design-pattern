package ss.strategy.strategies;

public class Hard implements Strategy {
    @Override
    public void handle() {
        System.out.println("it's a hard algorithm.");
    }
}
