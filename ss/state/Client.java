package ss.state;

import ss.state.connector.Connection;

public class Client {
    public static void main(String[] args) {
        Connection con = new Connection();
        con.activate();
        con.open();
        con.activate();
        con.close();
    }
}
