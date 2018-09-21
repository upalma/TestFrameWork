package search;

import base.CommonAPI;
import home.HomeLogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomeLogIn extends HomeLogIn {
    HomeLogIn homeLogIn;

    @BeforeMethod
    public void initialization(){
        homeLogIn= PageFactory.initElements(driver,HomeLogIn.class);
    }
    //positive testing
    @Test
    public void openFacebookBrowser() {
        driver.navigate();
    }
    //login positive testing: correct user name and correct password
    @Test
    public void logInFB(){
        homeLogIn.logInWithcorrectUserAndPassword();
    }
    //login negative testing: correct user name and wrong password
    @Test
    public void logIn1(){
        homeLogIn.loginInWithCorrectUserAndWrongPassword();
    }
    //login negative testing: correct user name and no password
    @Test
    public void logIn2(){
        homeLogIn.loginInWithCorrectUserNameAndNoPassword();
    }
    //login negative testing: no user name and correct password
    @Test
    public void logIn3(){
        homeLogIn.loginInwithNoUserNameAndCorrectPassword();
    }
    //login negative testing: wrong user name and correct password((found bug))
    @Test
    public void logIn4(){
        homeLogIn.loginInWithWrongUserNameAndCorrectPassword();
    }
    //login negative testing: wrong user name and wrong password
    @Test
    public void logIn5(){
        homeLogIn.loginInWithWrongUserNameAndWrongPassword();
    }
    //login negative testing: no user name and no password
    @Test
    public void logIn6(){
        homeLogIn.loginInWithNoUserNameAndNoPassword();
    }
}

