package regulation.entity_controller.exceptions;

public class InvalidDataException extends ControllerException {

    public InvalidDataException() {
        super("Data Array 'Byte[]' is empty");
    }

    public InvalidDataException(String mes) {
        super(mes);
    }

}
