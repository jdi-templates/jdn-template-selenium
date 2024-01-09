package test;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class ExampleTests extends BaseTest {
    private HomePage homePage;

    @BeforeMethod
    public void setUpPage() {
        homePage = new HomePage(driver);
    }

    @Test(description = "Example test")
    public void testMethod() {
        homePage.open();
        homePage.link.click();
    }
}
