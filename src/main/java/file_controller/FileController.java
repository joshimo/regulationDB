package file_controller;

import java.io.*;

public class FileController implements IOController {

    @Override
    public Byte[] readFile(String fileReference) throws IOException {

        Byte[] data;
        byte[] bytes;
        FileInputStream fis;
        File sourceFile = new File(fileReference);

        if (sourceFile.exists() & sourceFile.isFile()) {

            int fileSize = (int) sourceFile.length();

            bytes = new byte[fileSize];
            data = new Byte[fileSize];

            fis = new FileInputStream(sourceFile);
            fis.read(bytes);

            for (int cnt = 0; cnt < fileSize; cnt ++)
                data[cnt] = bytes[cnt];
        }
        else
            throw new FileNotFoundException();

        return data;
    }

    @Override
    public boolean writeFile(String path, Byte[] data) throws IOException {

        File file = new File(path);
        byte[] bytes = new byte[data.length];
        FileOutputStream fos;

        if (!file.getParentFile().exists())
            file.getParentFile().mkdirs();

        for (int i = 0; i < data.length; i ++)
            bytes[i] = data[i];

        fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.close();

        return (file.exists() & (file.length() == data.length));
    }

}