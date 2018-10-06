package homePageObjectModule;

import HomePageObjectModule.SignIn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SignInTest extends SignIn {
    SignIn signIn;
    @BeforeMethod
    public void init(){
         signIn = PageFactory.initElements(CommonAPI.driver,SignIn.class);
    }
    @Test
    public void createAmazonAccount(){
        signIn.createAccount();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }
    @Test
    public void signInAmazon(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.signInToAmazone();
    }
}
