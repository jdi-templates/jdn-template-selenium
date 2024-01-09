package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    public static final String IE = "ie";
    public static final String EDGE = "edge";
    public static final String SAFARI = "safari";

    public static WebDriver getDriver(String browserName) {
        if (browserName == null) {
            WebDriverManager.chromedriver()
                    .setup();
            return new ChromeDriver();
        }
        switch (browserName.toLowerCase()) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--window-size=1920x1080");
                chromeOptions.addArguments("disable-infobars");
                chromeOptions.addArguments("--disable-extensions");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                WebDriverManager.chromedriver()
                        .setup();
                return new ChromeDriver(chromeOptions);
            case FIREFOX:
                WebDriverManager.firefoxdriver()
                        .setup();
                return new FirefoxDriver();
            case IE:
                WebDriverManager.iedriver()
                        .setup();
                return new InternetExplorerDriver();
            case EDGE:
                WebDriverManager.edgedriver()
                        .setup();
                return new EdgeDriver();
            case SAFARI:
                return new SafariDriver();
            default:
                WebDriverManager.chromedriver()
                        .setup();
                return new ChromeDriver();
        }
    }
}