package regulation.messenger;

public class ConsoleMessenger implements Messenger {

    @Override
    public void print(String message) {
        System.out.println("Console -> " + message);
    }
}
