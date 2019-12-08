package actualtests;

import models.SearchPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.Browser;
import utilities.TakeScreenShots;

public class SearchPageTests extends BaseTestClass {
    SearchPage searchPage =null;
    Class currentClass= null;

    @BeforeClass
    public void setup(){
        currentClass = new Object().getClass();
    }

    @Test
    public void search(){
        searchPage=new SearchPage(Browser.Driver());
        searchPage.doGoogleSearch("selenium");
        TakeScreenShots.captureScreenShot(Browser.Driver(),currentClass.getEnclosingMethod().getName());

    }
}
