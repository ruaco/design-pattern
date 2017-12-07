package ss.state.connector;

import ss.state.states.*;

public class Connection {

    private MyState state;

    public Connection() {
        changeState(new Close());
    }

    public void open() {
        changeState(new Open());
        state.handle();
        changeState(new Activate());
    }

    public void activate() {
        if(state.state().equals(StateEnum.Activate)) {
            this.state.handle();
        }else {
            // todo 这里状态异常逻辑应该收敛在 state 中
            System.out.println("your connection is not active!");
        }
    }

    public void close() {
        changeState(new Close());
        state.handle();
    }

    private void changeState(MyState state) {
        this.state = state;
    }
}
