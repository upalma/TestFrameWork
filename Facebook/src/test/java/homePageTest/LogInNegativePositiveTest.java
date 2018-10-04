package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LogInNegativePositiveTest extends LogInNegativePositive {
    LogInNegativePositive homeLogIn;

    @BeforeMethod
    public void initialization(){
        homeLogIn= PageFactory.initElements(driver, LogInNegativePositive.class);
    }
    //positive testing
    @Test
    public void openFacebookBrowser() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate();
    }
    //login positive testing: correct user name and correct password
    @Test
    public void logInFB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.logInWithcorrectUserAndPassword();
    }
    //login negative testing: correct user name and wrong password
    @Test
    public void logIn1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.loginInWithCorrectUserAndWrongPassword();
    }
    //login negative testing: correct user name and no password
    @Test
    public void logIn2(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.loginInWithCorrectUserNameAndNoPassword();
    }
    //login negative testing: no user name and correct password
    @Test
    public void logIn3(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.loginInwithNoUserNameAndCorrectPassword();
    }
    //login negative testing: wrong user name and correct password((found bug))
    @Test
    public void logIn4(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.loginInWithWrongUserNameAndCorrectPassword();
    }
    //login negative testing: wrong user name and wrong password
    @Test
    public void logIn5(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.loginInWithWrongUserNameAndWrongPassword();
    }
    //login negative testing: no user name and no password
    @Test
    public void logIn6(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogIn.loginInWithNoUserNameAndNoPassword();
    }
}

