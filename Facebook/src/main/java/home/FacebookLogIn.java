package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogIn extends CommonAPI {
    @FindBy(css ="#email") WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;

    @FindBy (css = "#u_12_2 > input._1frb") WebElement searchBox;
    @FindBy(className="_1vp5") WebElement userProfile;


    public void logInFacebook() {
        userName.sendKeys("palma_ub1.com");
        userPassword.sendKeys("070122", Keys.ENTER);
    }
    public void clickOnProfile() {
        userProfile.click();
    }
    public void inputDataOnSearchBox() {
        searchBox.sendKeys("Hira", Keys.ENTER);
    }
}
