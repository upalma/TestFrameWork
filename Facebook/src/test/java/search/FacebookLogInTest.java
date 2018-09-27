package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogInTest extends FacebookLogIn {
FacebookLogIn fbLogIn;
    @BeforeMethod
    public void initialization() {
        fbLogIn = PageFactory.initElements(driver, FacebookLogIn.class);
    }
    @Test
    public void fbLogInSuccessfully() {
        fbLogIn.logInFacebook();
    }

    @Test
    public void logInButtonClick(){
        fbLogIn.clickLogInButton();
    }
}
