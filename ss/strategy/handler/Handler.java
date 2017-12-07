package ss.strategy.handler;

import ss.strategy.strategies.*;

public class Handler {

    private Strategy strategy;

    public Handler(Strategy strategy) {
        this.strategy = strategy;
    }

    public void process() {
        strategy.handle();
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
