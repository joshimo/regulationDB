package entity_controller.exceptions;

public abstract class ControllerException extends Exception {

    public ControllerException(String message) {
        super(message);
    }

}
