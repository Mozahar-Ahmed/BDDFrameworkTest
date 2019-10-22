package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    @FindBy(xpath = "//i[@class='fb_logo img sp_lFwffOkkE26 sx_46e267']")
    WebElement facebooklogo;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;


    public void homepageIsDiplayed() {
        Assert.assertEquals(facebooklogo.isDisplayed(), true, "Facebook homepage is not displayed");
    }

    public void emailIsDisplayed() {
        Assert.assertEquals(emailField.isDisplayed(), true, "Email field is not displayed");
    }


}
