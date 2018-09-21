package search;

import home.FacebookLogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFacebookLogIn extends FacebookLogIn {
FacebookLogIn fbLogIn;
    @BeforeMethod
    public void initialization() {
        fbLogIn = PageFactory.initElements(driver, FacebookLogIn.class);
    }

    @Test
    public void fbLogInSucessfully() {
        fbLogIn.logInFacebook();
    }
}
