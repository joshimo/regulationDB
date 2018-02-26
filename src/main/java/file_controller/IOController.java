package file_controller;

import datamodel.DocumentContainer;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IOController {

    Byte[] readFile(String fileReference) throws IOException;

    boolean writeFile(String filePath, Byte[] data) throws IOException ;

}