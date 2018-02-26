package application;

import datamodel.DocumentHeader;
import datamodel.DocumentContainer;
import entity_controller.DBController;
import entity_controller.EntityController;
import file_controller.FileController;
import file_controller.IOController;
import messenger.ConsoleMessenger;
import messenger.Messenger;

import java.io.IOException;
import java.util.List;

public class Main {

    private static Messenger messenger = new ConsoleMessenger();

    private static IOController fcontroller = new FileController();
    private static EntityController econtroller = new DBController();

    private static List<DocumentHeader> headers;
    private static List<DocumentContainer> uploads;
    private static List<DocumentContainer> downloads;
    private static List<DocumentContainer> mocks;

    static {
        try {
            mocks = EntityMock.createUploadMocks();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String... args) throws Exception {

        try {
            /*DocumentContainer h = EntityMock.createNullMock();
            econtroller.uploadDocument(h);*/
            headers = econtroller.getAllDocumentHeaders();
            for (DocumentHeader h : headers)
                messenger.print(h.toString());
            //econtroller.deleteDocumentByID(46);
        }
        finally {
            econtroller.shutdown();
        }

    }

}