package ss.state.states;

public class Close implements MyState {
    @Override
    public StateEnum state() {
        return StateEnum.Close;
    }

    @Override
    public void handle() {
        System.out.println("I am closing.");
    }
}
