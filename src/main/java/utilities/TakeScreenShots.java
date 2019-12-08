package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class TakeScreenShots  {

    public static void captureScreenShot(WebDriver driver, String name) {

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:/selenium/"+name+".png"));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
