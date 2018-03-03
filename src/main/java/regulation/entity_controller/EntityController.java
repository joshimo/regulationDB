package regulation.entity_controller;

import regulation.datamodel.DocumentContainer;
import regulation.datamodel.DocumentHeader;
import regulation.entity_controller.exceptions.DuplicationDataException;
import regulation.entity_controller.exceptions.InvalidDataException;
import regulation.entity_controller.exceptions.IdNotFoundException;
import regulation.entity_controller.exceptions.ShutDownException;

import java.util.List;

public interface EntityController {

    void uploadDocument(DocumentContainer upload) throws InvalidDataException, DuplicationDataException;

    void deleteDocumentByID(Integer id) throws Exception;

    <T> void updateDocument(T doc) throws IdNotFoundException, InvalidDataException;

    List getAllDocumentHeaders();

    <T> T getDocumentByID(Class T, Integer id) throws Exception;

    List<DocumentHeader> searchDocumentsByMask(final DocumentHeader mask);

    void shutdown() throws ShutDownException;

}
