package test;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import site.pages.FirstPage;

public class ExampleTests extends BaseTest {
    FirstPage firstPage = new FirstPage(driver);

    @Test
    @Description("Test case description for Google Chrome")
    public void testMethod() {
        firstPage.open();
    }
}
