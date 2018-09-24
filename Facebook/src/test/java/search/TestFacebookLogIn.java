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
    public void fbLogInSuccessfully() {
        fbLogIn.logInFacebook();
    }
    @Test
    public void inputDataInHomeSearchBox() {
        fbLogIn.logInFacebook();
        fbLogIn.inputDataOnSearchBox();
    }
    @Test
    public void clickOnMainPageProfileName(){
        fbLogIn.logInFacebook();
        fbLogIn.clickOnProfileName();
    }
}
