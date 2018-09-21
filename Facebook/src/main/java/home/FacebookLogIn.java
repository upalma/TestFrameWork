package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogIn extends CommonAPI {
    @FindBy(css = "#email") WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;

    public void logInFacebook() {
        userName.sendKeys("palma_ub13@gmail.com");
        userPassword.sendKeys("01711070122", Keys.ENTER);
    }
}
