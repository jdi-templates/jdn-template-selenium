package test;

import configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utilities.DriverFactory;

@Listeners()
public abstract class BaseTest {

    protected WebDriver driver;
    protected String baseUrl;

    @BeforeMethod
    public void setUp() {
        baseUrl = Configuration.getInstance()
                .getBaseUrl();
        driver = DriverFactory.getDriver(Configuration.getInstance()
                                                 .getBrowser());
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

