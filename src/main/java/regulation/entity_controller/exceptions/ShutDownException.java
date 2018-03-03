package regulation.entity_controller.exceptions;

public class ShutDownException extends ControllerException {

    public ShutDownException() {
        super("Current SessionFactory already closed");
    }
}
