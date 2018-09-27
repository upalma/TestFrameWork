package search;

import popUpTest.NewFacebookSignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewFacebookSignUpTest extends NewFacebookSignUp {
    NewFacebookSignUp fbSignUp;

    @BeforeMethod
    public void initialization() {
        fbSignUp = PageFactory.initElements(driver, NewFacebookSignUp.class);
    }
    @Test
    public void newFbSignUp() {
        fbSignUp.inputSignUpData();
    }
}