import java.net.Socket;

public interface MessageAPI {

    public void connect(String addr, int port);

    public void disconnect();

    public void exit();

    public void message(String name, String msg);

    public void messageX(String addr, int port, String msg);

    private void sendTcp(Socket connection, String text) {
    }

}
