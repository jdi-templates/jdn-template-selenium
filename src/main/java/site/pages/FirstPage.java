package site.pages;

import org.openqa.selenium.WebDriver;

// This is an example of Page Object definition. To be removed
public class FirstPage extends BasePage {
    private static final String PATH = "/";
    private static final String TITLE = "/";

    public FirstPage(final WebDriver driver) {
        super(driver, PATH);
    }
}
