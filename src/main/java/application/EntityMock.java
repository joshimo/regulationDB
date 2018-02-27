package application;

import datamodel.DocumentContainer;
import file_controller.FileController;
import file_controller.IOController;
import java.io.IOException;
import java.util.ArrayList;

public class EntityMock {

    private static IOController controller = new FileController();

    public static DocumentContainer createMock1() throws IOException {
        DocumentContainer mock = new DocumentContainer();
        mock.setDocName("ГОСТ 8.586.1-2005");
        mock.setDocType("ГОСТ");
        mock.setDocDescription("Измерение расхода и количества жидкостей и газов с помощью стандартных сужающих устройств. Часть 1");
        mock.setMandatoryRK(true);
        mock.setMandatoryRU(true);
        mock.setMandatoryUA(true);
        mock.setMandatoryEU(false);
        mock.setDocFileName("ГОСТ 8.586.1-2005.pdf");
        mock.setHashTag01("#расчет расходомеров");
        mock.setHashTag02("#сужающие устройства");
        mock.setHashTag03("#монтаж кип");
        mock.setHashTag04("#общие требования");
        mock.setNotes("Часть 1. Принцип метода измерений и общие требования.");
        mock.setDocStream(controller.readFile("d:\\Нормативные документы\\КиА\\ГОСТ 8.586.1-2005.pdf"));
        mock.calculateHashSum();
        return mock;
    }

    public static DocumentContainer createMock2() throws IOException  {
        DocumentContainer mock = new DocumentContainer();
        mock.setDocName("ГОСТ 8.586.2-2005");
        mock.setDocType("ГОСТ");
        mock.setDocDescription("Измерение расхода и количества жидкостей и газов с помощью стандартных сужающих устройств. Часть 2");
        mock.setMandatoryRK(true);
        mock.setMandatoryRU(true);
        mock.setMandatoryUA(true);
        mock.setMandatoryEU(false);
        mock.setDocFileName("ГОСТ 8.586.2-2005.pdf");
        mock.setHashTag01("#расчет расходомеров");
        mock.setHashTag02("#сужающие устройства");
        mock.setHashTag03("#монтаж кип");
        mock.setHashTag04("#диафрагмы");
        mock.setNotes("Часть 2. Диафрагмы. Технические требования");
        mock.setDocStream(controller.readFile("d:\\Нормативные документы\\КиА\\ГОСТ 8.586.2-2005.pdf"));
        mock.calculateHashSum();
        return mock;
    }

    public static DocumentContainer createMock3() throws IOException  {
        DocumentContainer mock = new DocumentContainer();
        mock.setDocName("ГОСТ 8.586.3-2005");
        mock.setDocType("ГОСТ");
        mock.setDocDescription("Измерение расхода и количества жидкостей и газов с помощью стандартных сужающих устройств. Часть 3");
        mock.setMandatoryRK(true);
        mock.setMandatoryRU(true);
        mock.setMandatoryUA(true);
        mock.setMandatoryEU(false);
        mock.setDocFileName("ГОСТ 8.586.3-2005.pdf");
        mock.setHashTag01("#расчет расходомеров");
        mock.setHashTag02("#сужающие устройства");
        mock.setHashTag03("#монтаж кип");
        mock.setHashTag04("#сопла");
        mock.setNotes("Часть 3. Сопла и сопла Вентури. Технические требования");
        mock.setDocStream(controller.readFile("d:\\Нормативные документы\\КиА\\ГОСТ 8.586.3-2005.pdf"));
        mock.calculateHashSum();
        return mock;
    }

    public static DocumentContainer createMock4() throws IOException  {
        DocumentContainer mock = new DocumentContainer();
        mock.setDocName("ГОСТ 8.586.4-2005");
        mock.setDocType("ГОСТ");
        mock.setDocDescription("Измерение расхода и количества жидкостей и газов с помощью стандартных сужающих устройств. Часть 4");
        mock.setMandatoryRK(true);
        mock.setMandatoryRU(true);
        mock.setMandatoryUA(true);
        mock.setMandatoryEU(false);
        mock.setDocFileName("ГОСТ 8.586.4-2005.pdf");
        mock.setHashTag01("#расчет расходомеров");
        mock.setHashTag02("#сужающие устройства");
        mock.setHashTag03("#монтаж кип");
        mock.setHashTag04("#трубы вентури");
        mock.setNotes("Часть 4. Трубы Вентури. Технические требования");
        mock.setDocStream(controller.readFile("d:\\Нормативные документы\\КиА\\ГОСТ 8.586.4-2005.pdf"));
        mock.calculateHashSum();
        return mock;
    }

    public static DocumentContainer createMock5() throws IOException  {
        DocumentContainer mock = new DocumentContainer();
        mock.setDocName("ГОСТ 8.586.5-2005");
        mock.setDocType("ГОСТ");
        mock.setDocDescription("Измерение расхода и количества жидкостей и газов с помощью стандартных сужающих устройств. Часть 5");
        mock.setMandatoryRK(true);
        mock.setMandatoryRU(true);
        mock.setMandatoryUA(true);
        mock.setMandatoryEU(false);
        mock.setDocFileName("ГОСТ 8.586.5-2005.pdf");
        mock.setHashTag01("#расчет расходомеров");
        mock.setHashTag02("#сужающие устройства");
        mock.setHashTag03("#монтаж кип");
        mock.setHashTag04("#измерение");
        mock.setNotes("Часть 5. Методика выполнения измерений");
        mock.setDocStream(controller.readFile("d:\\Нормативные документы\\КиА\\ГОСТ 8.586.5-2005.pdf"));
        mock.calculateHashSum();
        return mock;
    }

    public static DocumentContainer createNullMock() throws IOException  {
        DocumentContainer mock = new DocumentContainer();
        mock.calculateHashSum();
        mock.setDocStream(controller.readFile("d:\\Нормативные документы\\КиА\\ГОСТ 8.586.5-2005.pdf"));
        return mock;
    }

    public static ArrayList<DocumentContainer> createUploadMocks() throws IOException  {
        ArrayList<DocumentContainer> mocks = new ArrayList<>();
        mocks.add(createMock1());
        mocks.add(createMock2());
        mocks.add(createMock3());
        mocks.add(createMock4());
        mocks.add(createMock5());
        return mocks;
    }
}
