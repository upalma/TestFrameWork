package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FacebookLogInTest extends FacebookLogIn {
FacebookLogIn fbLogIn;
    @BeforeMethod
    public void initialization() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fbLogIn = PageFactory.initElements(driver, FacebookLogIn.class);
    }
    @Test
    public void fbLogInSuccessfully() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fbLogIn.logInFacebook();
    }
    @Test
    public void logInButtonClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fbLogIn.clickLogInButton();
    }
}
