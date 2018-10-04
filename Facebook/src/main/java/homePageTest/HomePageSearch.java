package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePageSearch extends CommonAPI {
    @FindBy(css ="#email")
    WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;
    @FindBy (className = "_1frb") WebElement searchBoxOnMainPage;
    @FindBy(className="_1vp5") WebElement userProfileName;

    public void logInFacebook() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("palub13@yahoo.com");
        userPassword.sendKeys("0070122", Keys.ENTER);
    }
    public void clickOnProfileName() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userProfileName.click();
    }
    public void inputDataOnSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBoxOnMainPage.sendKeys("Hira", Keys.ENTER);
    }
}