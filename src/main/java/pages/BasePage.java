package pages;

import java.util.List;

import configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public final WebDriver driver;
    public final int DEFAULT_TIMEOUT = 30;
    protected String baseUrl;
    protected String path;

    public BasePage(WebDriver driver, String path) {
        this.driver = driver;
        this.path = path;
        baseUrl = Configuration.getInstance()
                .getBaseUrl();
        PageFactory.initElements(driver, this);
    }

    public void waitUntilElementVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilElementClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void click(WebElement webElement) {
        waitUntilElementClickable(webElement);
        webElement.click();
    }

    public WebElement getElement(WebElement webElement) {
        waitUntilElementVisible(webElement);
        return webElement;
    }

    public List<WebElement> getElements(List<WebElement> webElements) {
        for (WebElement element : webElements) {
            waitUntilElementVisible(element);
        }
        return webElements;
    }

    public void sendKeys(WebElement webElement, String text) {
        waitUntilElementVisible(webElement);
        webElement.sendKeys(text);
    }

    public void open() {
        driver.get(baseUrl + this.path);
    }
}