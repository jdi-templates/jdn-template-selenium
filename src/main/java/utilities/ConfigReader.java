package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static String getConfigProperty(String propertyName) {
        return getPropertyValue("config.properties", propertyName);
    }

    private static String getPropertyValue(String propertyFileName, String propertyName) {
        String propertyValue = null;

        try (InputStream input = new FileInputStream("./src/test/resources/" + propertyFileName)) {
            Properties prop = new Properties();
            prop.load(input);
            propertyValue = prop.getProperty(propertyName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return propertyValue;
    }
}