package site.pages;

import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public abstract class BasePage {

    protected WebDriver driver;
    protected String baseUrl;
    protected String path;
    ConfigReader configReader;

    public BasePage(WebDriver driver, String path) {
        this.driver = driver;
        this.configReader = new ConfigReader();
        this.baseUrl = configReader.getBaseUrl();
        this.path = path;
    }

    public void open() {
        driver.get(baseUrl + this.path);
    }
}