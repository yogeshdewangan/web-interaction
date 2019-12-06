package actualtests;

import org.junit.BeforeClass;
import utilities.Browser;

public class BaseTestClass {
    @BeforeClass
    public static void init()  {
        Browser.Initialize();
    }
}
