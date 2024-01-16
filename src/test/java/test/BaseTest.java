package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import config.AppConfig;
import utilities.DriverFactory;

@Listeners()
public abstract class BaseTest {

    protected WebDriver driver;
    protected String baseUrl;

    @BeforeMethod
    public void setUp() {
        baseUrl = AppConfig.BASE_URL;
        driver = DriverFactory.getDriver(AppConfig.BROWSER);
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

