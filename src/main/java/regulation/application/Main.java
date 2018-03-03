package regulation.application;

import regulation.datamodel.DocumentHeader;
import regulation.datamodel.DocumentContainer;
import regulation.entity_controller.DBController;
import regulation.entity_controller.EntityController;
import regulation.file_controller.FileController;
import regulation.file_controller.IOController;
import regulation.messenger.ConsoleMessenger;
import regulation.messenger.Messenger;

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
            //DocumentContainer h = EntityMock.createNullMock();
            //mocks = EntityMock.createUploadMocks();
            //for (DocumentContainer dc : mocks)
            //    econtroller.uploadDocument(h);

            DocumentContainer dc = econtroller.getDocumentByID(DocumentContainer.class, 1);
            dc.setApplicationInstrumentation(true);
            dc.setApplicationMeasurement(true);
            econtroller.updateDocument(dc);

            headers = econtroller.getAllDocumentHeaders();
            for (DocumentHeader hdr : headers)
                messenger.print(hdr.toString());

            //econtroller.deleteDocumentByID(46);
        }
        finally {
            econtroller.shutdown();
        }

    }

}