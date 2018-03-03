package regulation.entity_controller.exceptions;

public class DuplicationDataException extends ControllerException {

    public DuplicationDataException() {
        super("Attempt to duplicate data. Same document already exists in DB");
    }

    public DuplicationDataException(Integer id) {
        super("Attempt to duplicate data. Same document with id=" + id + " already exists in DB");
    }

}
