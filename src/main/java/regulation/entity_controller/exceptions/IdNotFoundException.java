package regulation.entity_controller.exceptions;

public class IdNotFoundException extends ControllerException {

    public IdNotFoundException() {
        super("Requested Id is null");
    }

    public IdNotFoundException(Integer id) {
        super("Requested Id=" + id + " not found in database");
    }

}
