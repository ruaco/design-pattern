package ss.strategy;

import ss.strategy.handler.Handler;
import ss.strategy.strategies.Hard;
import ss.strategy.strategies.Normal;
import ss.strategy.strategies.Simple;
import ss.strategy.strategies.Strategy;

public class Client {
    public static void main(String[] args) {

        Strategy simple = new Simple();
        Strategy normal = new Normal();
        Strategy hard = new Hard();

        Handler handler = new Handler(simple);
        handler.process();
        handler.changeStrategy(normal);
        handler.process();
        handler.changeStrategy(hard);
        handler.process();
    }
}
