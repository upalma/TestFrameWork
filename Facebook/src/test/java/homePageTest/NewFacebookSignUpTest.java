package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NewFacebookSignUpTest extends NewFacebookSignUp {
    NewFacebookSignUp fbSignUp;

    @BeforeMethod
    public void initialization() {
        fbSignUp = PageFactory.initElements(driver, NewFacebookSignUp.class);
    }
    @Test
    public void newFbSignUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fbSignUp.inputSignUpData();
    }
}