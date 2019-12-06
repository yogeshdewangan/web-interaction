package models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    private final String LOGIN_EMAIL_ID = "ap_email";
    private final String PASSWORD_ID = "ap_password";
    private final String LOGIN_BUTTON_ID = "signInButton";


    @FindBy(how = How.ID, using = LOGIN_EMAIL_ID)
    @CacheLookup
    private WebElement loginEmailIDElement;

    @FindBy(how = How.ID, using = PASSWORD_ID)
    @CacheLookup
    private WebElement passwordElement;

    @FindBy(how = How.ID, using = LOGIN_BUTTON_ID)
    @CacheLookup
    private WebElement loginButtonElement;

    public void fillEmailID(String emailID) {
        loginEmailIDElement.sendKeys(emailID);
    }

    public void fillPassword(String password) {
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonElement.click();
    }

}
