package ss.state.states;

public class Open implements MyState {
    @Override
    public StateEnum state() {
        return StateEnum.Open;
    }

    @Override
    public void handle() {
        System.out.println("I am opening.");
    }
}
