package regulation.datamodel;

import java.io.*;
import java.util.Properties;

public class UDFMapping {
    private String UDF01_VALUE = "";
    private String UDF02_VALUE = "";
    private String UDF03_VALUE = "";
    private String UDF04_VALUE = "";
    private String UDF05_VALUE = "";
    private String UDF06_VALUE = "";
    private String UDF07_VALUE = "";
    private String UDF08_VALUE = "";
    private String UDF09_VALUE = "";
    private String UDF10_VALUE = "";
    private String UDF11_VALUE = "";
    private String UDF12_VALUE = "";
    private String UDF13_VALUE = "";
    private String UDF14_VALUE = "";
    private String UDF15_VALUE = "";
    private String UDF16_VALUE = "";
    private String UDF17_VALUE = "";
    private String UDF18_VALUE = "";
    private String UDF19_VALUE = "";
    private String UDF20_VALUE = "";
    private String UDF21_VALUE = "";
    private String UDF22_VALUE = "";
    private String UDF23_VALUE = "";
    private String UDF24_VALUE = "";
    private String UDF25_VALUE = "";
    private String UDF26_VALUE = "";
    private String UDF27_VALUE = "";
    private String UDF28_VALUE = "";
    private String UDF29_VALUE = "";
    private String UDF30_VALUE = "";
    private String UDF31_VALUE = "";
    private String UDF32_VALUE = "";

    private static UDFMapping instance = new UDFMapping();

    public static UDFMapping getInstance() {
        return instance;
    }

    private UDFMapping() {
        try {
            Properties prop = new Properties();
            prop.load(getClass().getClassLoader().getResourceAsStream("regulation_udfs.properties"));
            UDF01_VALUE = new String(prop.getProperty("UDF01_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF02_VALUE = new String(prop.getProperty("UDF02_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF03_VALUE = new String(prop.getProperty("UDF03_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF04_VALUE = new String(prop.getProperty("UDF04_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF05_VALUE = new String(prop.getProperty("UDF05_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF06_VALUE = new String(prop.getProperty("UDF06_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF07_VALUE = new String(prop.getProperty("UDF07_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF08_VALUE = new String(prop.getProperty("UDF08_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF09_VALUE = new String(prop.getProperty("UDF09_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF10_VALUE = new String(prop.getProperty("UDF10_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF11_VALUE = new String(prop.getProperty("UDF11_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF12_VALUE = new String(prop.getProperty("UDF12_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF13_VALUE = new String(prop.getProperty("UDF13_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF14_VALUE = new String(prop.getProperty("UDF14_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF15_VALUE = new String(prop.getProperty("UDF15_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF16_VALUE = new String(prop.getProperty("UDF16_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF17_VALUE = new String(prop.getProperty("UDF17_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF18_VALUE = new String(prop.getProperty("UDF18_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF19_VALUE = new String(prop.getProperty("UDF19_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF20_VALUE = new String(prop.getProperty("UDF20_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF21_VALUE = new String(prop.getProperty("UDF21_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF22_VALUE = new String(prop.getProperty("UDF22_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF23_VALUE = new String(prop.getProperty("UDF23_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF24_VALUE = new String(prop.getProperty("UDF24_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF25_VALUE = new String(prop.getProperty("UDF25_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF26_VALUE = new String(prop.getProperty("UDF26_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF27_VALUE = new String(prop.getProperty("UDF27_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF28_VALUE = new String(prop.getProperty("UDF28_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF29_VALUE = new String(prop.getProperty("UDF29_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF30_VALUE = new String(prop.getProperty("UDF30_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF31_VALUE = new String(prop.getProperty("UDF31_VALUE").getBytes("iso-8859-1"), "utf8");
            UDF32_VALUE = new String(prop.getProperty("UDF32_VALUE").getBytes("iso-8859-1"), "utf8");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public String getUDF01_VALUE() {
        return UDF01_VALUE;
    }

    public String getUDF02_VALUE() {
        return UDF02_VALUE;
    }

    public String getUDF03_VALUE() {
        return UDF03_VALUE;
    }

    public String getUDF04_VALUE() {
        return UDF04_VALUE;
    }

    public String getUDF05_VALUE() {
        return UDF05_VALUE;
    }

    public String getUDF06_VALUE() {
        return UDF06_VALUE;
    }

    public String getUDF07_VALUE() {
        return UDF07_VALUE;
    }

    public String getUDF08_VALUE() {
        return UDF08_VALUE;
    }

    public String getUDF09_VALUE() {
        return UDF09_VALUE;
    }

    public String getUDF10_VALUE() {
        return UDF10_VALUE;
    }

    public String getUDF11_VALUE() {
        return UDF11_VALUE;
    }

    public String getUDF12_VALUE() {
        return UDF12_VALUE;
    }

    public String getUDF13_VALUE() {
        return UDF13_VALUE;
    }

    public String getUDF14_VALUE() {
        return UDF14_VALUE;
    }

    public String getUDF15_VALUE() {
        return UDF15_VALUE;
    }

    public String getUDF16_VALUE() {
        return UDF16_VALUE;
    }

    public String getUDF17_VALUE() {
        return UDF17_VALUE;
    }

    public String getUDF18_VALUE() {
        return UDF18_VALUE;
    }

    public String getUDF19_VALUE() {
        return UDF19_VALUE;
    }

    public String getUDF20_VALUE() {
        return UDF20_VALUE;
    }

    public String getUDF21_VALUE() {
        return UDF21_VALUE;
    }

    public String getUDF22_VALUE() {
        return UDF22_VALUE;
    }

    public String getUDF23_VALUE() {
        return UDF23_VALUE;
    }

    public String getUDF24_VALUE() {
        return UDF24_VALUE;
    }

    public String getUDF25_VALUE() {
        return UDF25_VALUE;
    }

    public String getUDF26_VALUE() {
        return UDF26_VALUE;
    }

    public String getUDF27_VALUE() {
        return UDF27_VALUE;
    }

    public String getUDF28_VALUE() {
        return UDF28_VALUE;
    }

    public String getUDF29_VALUE() {
        return UDF29_VALUE;
    }

    public String getUDF30_VALUE() {
        return UDF30_VALUE;
    }

    public String getUDF31_VALUE() {
        return UDF31_VALUE;
    }

    public String getUDF32_VALUE() {
        return UDF32_VALUE;
    }
}
