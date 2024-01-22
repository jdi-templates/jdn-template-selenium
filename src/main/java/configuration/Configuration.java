package configuration;

import static java.lang.Boolean.parseBoolean;

public class Configuration {
    private static final Configuration INSTANCE = new Configuration();

    private final String baseUrl;
    private final String browser;
    private final boolean headless;

    private Configuration() {
        // Initialize configuration properties
        this.baseUrl = getProperty("base.url", "https://example.com");
        this.browser = getProperty("browser", "chrome");
        this.headless = parseBoolean(getProperty("headless", "true"));
    }

    public static Configuration getInstance() {
        return INSTANCE;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBrowser() {
        return browser;
    }

    public boolean isHeadless() {
        return headless;
    }

    private String getProperty(String propertyName, String defaultValue) {
        return System.getProperty(propertyName, defaultValue);
    }
}

