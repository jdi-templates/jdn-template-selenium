package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// This is an example of Page Object definition. To be removed
public class HomePage extends BasePage {
    private static final String PATH = "/";
    @FindBy(css = "p > a")
    public WebElement link;

    public HomePage(final WebDriver driver) {
        super(driver, PATH);
    }
}
