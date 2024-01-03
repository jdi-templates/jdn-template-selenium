package utilities;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigReader {

    Configurations configs = new Configurations();
    Configuration config;

    public ConfigReader() {
        try {
            config = configs.properties("src/test/resources/config.properties");
        } catch (ConfigurationException cex) {
            // Something went wrong
        }
    }

    public String getBaseUrl() {
        return config.getString("baseUrl");
    }
}