package regulation.config;

import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RegulationConfig {

    private String departmentName = "";
    private String adminName = "";
    private String adminPassword = "";
    private String hibernateUser = "";
    private String hibernatePassword = "";
    private String hibernateUrl = "";
    private String hibernateDriverClass = "";

    private static RegulationConfig instance = new RegulationConfig();

    private RegulationConfig() {
        try {
            Properties prop = new Properties();
            prop.load(getClass().getClassLoader().getResourceAsStream("project.properties"));
            departmentName = new String(prop.getProperty("department").getBytes("iso-8859-1"), "utf8");
            adminName = new String(prop.getProperty("adminName").getBytes("iso-8859-1"), "utf8");
            adminPassword = new String(prop.getProperty("adminPassword").getBytes("iso-8859-1"), "utf8");
            hibernateUser = new String(prop.getProperty("dbUser").getBytes("iso-8859-1"), "utf8");
            hibernatePassword = new String(prop.getProperty("dbPassword").getBytes("iso-8859-1"), "utf8");
            hibernateUrl = new String(prop.getProperty("dbUrl").getBytes("iso-8859-1"), "utf8");
            hibernateDriverClass = new String(prop.getProperty("dbDriverClass").getBytes("iso-8859-1"), "utf8");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static RegulationConfig getRegulationConfig() {
        return instance;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getHibernateUser() {
        return hibernateUser;
    }

    public String getHibernatePassword() {
        return hibernatePassword;
    }

    public String getHibernateUrl() {
        return hibernateUrl;
    }

    public String getHibernateDriverClass() {
        return hibernateDriverClass;
    }
}