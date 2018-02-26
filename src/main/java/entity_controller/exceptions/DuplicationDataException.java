package entity_controller.exceptions;

public class DuplicationDataException extends ControllerException {

    public DuplicationDataException() {
        super("Attempt to duplicate data. Document with same header already exists in DB");
    }

}
