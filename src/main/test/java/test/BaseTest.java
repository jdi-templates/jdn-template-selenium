package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utilities.DriverFactory;

@Listeners()
public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.createDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // You can also include other setup and teardown methods,
    // logging methods, or other utilities your tests might need.
}

