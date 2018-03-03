package regulation.entity_controller;

import regulation.datamodel.DocumentContainer;
import regulation.datamodel.DocumentHeader;
import regulation.entity_controller.exceptions.DuplicationDataException;
import regulation.entity_controller.exceptions.IdNotFoundException;
import regulation.entity_controller.exceptions.InvalidDataException;
import regulation.entity_controller.exceptions.ShutDownException;
import regulation.messenger.ConsoleMessenger;
import regulation.messenger.Messenger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service("springDBController")
@Transactional
public class SpringDBController implements EntityController{

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    private Session session;
    private Messenger messenger = new ConsoleMessenger();

    private ValidatorFactory vf;
    private Validator validator;

    /**
     * Constructors
     * */

    public SpringDBController() {

        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    /**
     * Entity controller interface implementation methods
     * */

    @Override
    public void uploadDocument(DocumentContainer upload) throws InvalidDataException, DuplicationDataException {

        if (!this.checkDuplication(upload)) {

            validateDocument(upload);

            if (upload != null && upload.getDocStream() != null && upload.getDocStream().length > 0) {
                messenger.print("Beginning upload, wait...");
                session = sessionFactory.openSession();
                session.beginTransaction();
                session.save(upload);
                session.getTransaction().commit();
                session.close();
                messenger.print("Document have been uploaded!");
            } else
                throw new InvalidDataException();
        }
        else
            throw new DuplicationDataException();
    }

    @Override
    public void deleteDocumentByID(Integer id) throws IdNotFoundException {

        if (id == null)
            throw new IdNotFoundException();

        try {
            messenger.print("Deleting document with id = " + id);
            session = sessionFactory.openSession();
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
                session = sessionFactory.openSession();
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
        session = sessionFactory.openSession();

        Query query = session.createQuery("from DocumentHeader ");
        for (Object o : query.list())
            headers.add((DocumentHeader) o);

        session.close();

        return headers;
    }

    @Override
    public <T> T getDocumentByID(Class T, Integer id) throws Exception {

        T doc = (T) T.newInstance();
        session = sessionFactory.openSession();

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
    public List<DocumentHeader> searchDocumentsByMask(final DocumentHeader mask) {

        List<DocumentHeader> headers;
        List<DocumentHeader> searchResults = new ArrayList<>();

        String maskName = "";
        String maskDescription = "";
        String maskType = "";
        String hashTag01 = "";
        String hashTag02 = "";
        String hashTag03 = "";
        String hashTag04 = "";
        String hashTag05 = "";
        String hashTag06 = "";
        Boolean maskMandatoryUA;
        Boolean maskMandatoryRK;
        Boolean maskMandatoryRU;
        Boolean maskMandatoryEU;

        if (mask != null) {

            if (mask.getDocName() != null)
                maskName = mask.getDocName().toLowerCase().replaceAll(" ", "");
            if (mask.getDocDescription() != null)
                maskDescription = mask.getDocDescription().toLowerCase().replaceAll(" ", "");
            if (mask.getDocType() != null)
                maskType = mask.getDocType().toLowerCase().replaceAll(" ", "");
            if (mask.getHashTag01() != null)
                maskType = mask.getHashTag01().toLowerCase().replaceAll(" ", "");
            if (mask.getHashTag02() != null)
                maskType = mask.getHashTag02().toLowerCase().replaceAll(" ", "");
            if (mask.getHashTag03() != null)
                maskType = mask.getHashTag03().toLowerCase().replaceAll(" ", "");
            if (mask.getHashTag04() != null)
                maskType = mask.getHashTag04().toLowerCase().replaceAll(" ", "");
            if (mask.getHashTag05() != null)
                maskType = mask.getHashTag05().toLowerCase().replaceAll(" ", "");
            if (mask.getHashTag06() != null)
                maskType = mask.getHashTag06().toLowerCase().replaceAll(" ", "");

            maskMandatoryUA = mask.getMandatoryUA();
            maskMandatoryRK = mask.getMandatoryRK();
            maskMandatoryRU = mask.getMandatoryRU();
            maskMandatoryEU = mask.getMandatoryEU();

            headers = getAllDocumentHeaders();

            for (DocumentHeader header : headers) {

                if (header.getDocName().toLowerCase().contains(mask.getDocName().toLowerCase()));

            }
        }

        return searchResults;
    }

    @Override
    public void shutdown() throws ShutDownException {
        if (sessionFactory.isClosed()) throw new ShutDownException();
        else sessionFactory.close();
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

    private boolean checkDuplication(DocumentContainer doc) {

        List<DocumentHeader> headers = getAllDocumentHeaders();

        for (DocumentHeader header : headers)
            if (header.getHashSum() == doc.getHashSum() && header.getFileSize() == doc.getFileSize())
                return true;

        return false;
    }
}
