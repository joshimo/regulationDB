package regulation.file_controller;

import java.io.IOException;

public interface IOController {

    Byte[] readFile(String fileReference) throws IOException;

    boolean writeFile(String filePath, Byte[] data) throws IOException ;

}