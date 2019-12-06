package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private final String SEARCH_TEXTBOX_NAME = "gLFyf";
    private final String SEARCH_BUTTON_NAME = "gNO89b";



    @FindBy(how = How.CLASS_NAME, using = SEARCH_TEXTBOX_NAME)
    @CacheLookup
    private WebElement searchTextBoxElement;

    @FindBy(how = How.CLASS_NAME, using = SEARCH_BUTTON_NAME)
    @CacheLookup
    private WebElement searchButtonElement;

    public SearchPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void doGoogleSearch(String searchTerm) {
        searchKey(searchTerm);
        clickSearchButton();
    }

    private void searchKey(String key) {
        searchTextBoxElement.sendKeys(key);
    }

    private void clickSearchButton() {
        searchButtonElement.click();
    }

}
