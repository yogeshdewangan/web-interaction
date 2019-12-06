package actualtests;

import models.SearchPage;
import org.junit.Assert;
import org.junit.Test;
import utilities.Browser;

public class SearchPageTests extends BaseTestClass {

    @Test
    public void search(){

      new  SearchPage(Browser.Driver()).doGoogleSearch("selenium");

    }
}
