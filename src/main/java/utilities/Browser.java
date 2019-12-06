package utilities;

import org.openqa.selenium.WebDriver;
import webdriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Browser {
    private static String baseUrl = PropertyLoader.loadProperties("site.url");
    private static String browser = PropertyLoader.loadProperties("browser.name");

    private static WebDriver webDriver;

    public static void Initialize() {
        webDriver = WebDriverFactory.getDriverInstance(browser);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goTo();
        webDriver.manage().window().maximize();
    }

    public static void goTo() {
        webDriver.get(baseUrl);
    }

    public static WebDriver Driver() {
        return webDriver;
    }

}
