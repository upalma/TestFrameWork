package search;

import home.NewFacebookSignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNewFacebookSignUp extends NewFacebookSignUp {
    NewFacebookSignUp fbSignUp;

    @BeforeMethod
    public void initialization() {
        fbSignUp = PageFactory.initElements(driver, NewFacebookSignUp.class);
    }
    @Test
    public void newFbSignUp() {
        fbSignUp.inputSignUpData();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void FBSignUp() {
        fbSignUp.setText_signUpField_firstName("Bright");
        fbSignUp.setText_signUpField_lastName("Palma");
        fbSignUp.setText_signUpField_emailAddress("palma.ub13@gmail.com");
        fbSignUp.setText_signUpField_ReEnteremailAddress("palma.ub13@gmail.com");
        fbSignUp.setText_signUpField_newPassword("2403603914");
        fbSignUp.selectBirthMonth("10");
        fbSignUp.selectBirthDay("12");
        fbSignUp.selectBirthYear("2000");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}