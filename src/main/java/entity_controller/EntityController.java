package entity_controller;

import datamodel.DocumentContainer;
import entity_controller.exceptions.DuplicationDataException;
import entity_controller.exceptions.InvalidDataException;
import entity_controller.exceptions.IdNotFoundException;
import entity_controller.exceptions.ShutDownException;

import java.util.List;

public interface EntityController {

    void uploadDocument(DocumentContainer upload) throws InvalidDataException, DuplicationDataException;

    void deleteDocumentByID(Integer id) throws Exception;

    <T> void updateDocument(T doc) throws IdNotFoundException, InvalidDataException;

    List getAllDocumentHeaders();

    <T> T getDocumentByID(Class T, Integer id) throws Exception;

    void shutdown() throws ShutDownException;

}
