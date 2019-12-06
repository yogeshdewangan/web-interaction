package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static final String CHROME_DRIVER ="Chrome";

    public static WebDriver getDriverInstance(String browserName){
        WebDriver webDriver= null;
        if (browserName.equals(CHROME_DRIVER)){
            //ChromeDriverManager.setup();
            System.setProperty("webdriver.chrome.driver", "C:\\Projects\\web-interaction\\geckodriver.exe" );

            //Create driver object for Chrome
             webDriver = new FirefoxDriver();
        }
        return webDriver;
    }
}
