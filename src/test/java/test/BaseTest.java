package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utilities.DriverFactory;

import static utilities.ConfigReader.getConfigProperty;

@Listeners()
public abstract class BaseTest {

    protected WebDriver driver;
    protected String baseUrl;

    @BeforeMethod
    public void setUp() {
        baseUrl = getConfigProperty("baseUrl");
        driver = DriverFactory.getDriver(getConfigProperty("browser"));
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

