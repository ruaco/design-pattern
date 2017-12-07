package ss.state.states;

public class Activate implements MyState {
    @Override
    public StateEnum state() {
        return StateEnum.Activate;
    }

    @Override
    public void handle() {
        System.out.println("I am activating.");
    }
}
