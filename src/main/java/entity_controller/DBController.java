package entity_controller;

import com.sun.istack.internal.NotNull;
import datamodel.DocumentContainer;
import datamodel.DocumentHeader;
import entity_controller.exceptions.InvalidDataException;
import entity_controller.exceptions.IdNotFoundException;
import entity_controller.exceptions.ShutDownException;
import messenger.ConsoleMessenger;
import messenger.Messenger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DBController implements EntityController {

    private SessionFactory ourSessionFactory;
    private Session session;
    private Messenger messenger = new ConsoleMessenger();

    private ValidatorFactory vf;
    private Validator validator;

    /**
     * Constructors
     * */

    public DBController(Messenger messenger) {
        this();
        this.messenger = messenger;
    }

    public DBController() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        }
        catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    /**
     * Entity controller interface implementation methods
     * */

    @Override
    public void uploadDocument(DocumentContainer upload) throws InvalidDataException {

        validateDocument(upload);

        if (upload != null && upload.getDocStream() != null && upload.getDocStream().length > 0 ) {
            messenger.print("Beginning upload, wait...");
            session = ourSessionFactory.openSession();
            session.beginTransaction();
            session.save(upload);
            session.getTransaction().commit();
            session.close();
            messenger.print("Document have been uploaded!");
        }
        else
            throw new InvalidDataException();
    }

    @Override
    public void deleteDocumentByID(Integer id) throws IdNotFoundException {

        if (id == null)
            throw new IdNotFoundException();

        try {
            messenger.print("Deleting document with id = " + id);
            session = ourSessionFactory.openSession();
            if (checkID(id)) {
                session.beginTransaction();
                DocumentContainer doc = session.get(DocumentContainer.class, id);
                session.delete(doc);
                session.getTransaction().commit();
                if (!checkID(id))
                    messenger.print("Document have been removed from database");
            }
            else
                throw new IdNotFoundException(id);
        }
        finally {
            session.close();
        }
    }

    @Override
    public <T> void updateDocument(T doc) throws IdNotFoundException, InvalidDataException {

        Integer id = null;

        if (doc == null)
            throw new InvalidDataException();

        if (doc instanceof DocumentContainer)
            id = ((DocumentContainer) doc).getDocNum();

        if (doc instanceof DocumentHeader)
            id = ((DocumentHeader) doc).getDocNum();

        validateDocument(doc);

        if (id != null) {
            try {
                session = ourSessionFactory.openSession();
                if (checkID(id)) {
                    session.clear();
                    session.beginTransaction();
                    session.update(doc);
                    session.getTransaction().commit();
                } else
                    throw new IdNotFoundException(id);
            }
            finally {
                session.close();
            }
        }
        else
            throw new IdNotFoundException();
    }

    @Override
    public List<DocumentHeader> getAllDocumentHeaders() {

        List<DocumentHeader> headers = new ArrayList<>();
        session = ourSessionFactory.openSession();

        Query query = session.createQuery("from DocumentHeader ");
        for (Object o : query.list())
            headers.add((DocumentHeader) o);

        session.close();

        return headers;
    }

    @Override
    public <T> T getDocumentByID(Class T, Integer id) throws Exception {

        T doc = (T) T.newInstance();
        session = ourSessionFactory.openSession();

        try {
            if (checkID(id)) {
                if (doc instanceof DocumentContainer) {
                    Query query = session.createQuery("from DocumentContainer where id=" + id);
                    doc = (T) query.list().get(0);
                }
                if (doc instanceof DocumentHeader) {
                    Query query = session.createQuery("from DocumentHeader where id=" + id);
                    doc = (T) query.list().get(0);
                }
            } else
                throw new IdNotFoundException(id);
        }
        finally {
            session.close();
        }

        return doc;
    }

    @Override
    public void shutdown() throws ShutDownException {
        if (ourSessionFactory.isClosed()) throw new ShutDownException();
        else ourSessionFactory.close();
    }

    /**
     * private and internal checking & validating methods
     * */

    private boolean checkID(Integer id) {
        Query query = session.createQuery("from DocumentHeader where docNum=" + id);
        return !query.list().isEmpty();
    }

    private <T> void validateDocument(T doc) throws InvalidDataException {

        String message = "";
        Set<ConstraintViolation<T>> violations = validator.validate(doc);

        if (!violations.isEmpty()) {
            for (ConstraintViolation violation : violations)
                message += "\n" + violation.getPropertyPath() + "=" + violation.getInvalidValue() + " " + violation.getMessage();

            throw new InvalidDataException(message);
        }
    }

    private boolean checkExistance(@NotNull DocumentContainer doc) {
        return false;
    }
}
