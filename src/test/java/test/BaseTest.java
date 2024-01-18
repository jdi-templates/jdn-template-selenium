package test;

import config.AppConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utilities.DriverFactory;

@Listeners()
public abstract class BaseTest {

    protected WebDriver driver;
    protected String baseUrl;
    protected String browser = System.getProperty("browser", "chrome");
    ;

    @BeforeMethod
    public void setUp() {
        baseUrl = System.getProperty("base.url", "https://example.com");
        driver = DriverFactory.getDriver(browser);
        driver.manage()
                .window()
                .maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

