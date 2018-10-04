package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LogInPageClickTest extends LogInPageClick {
LogInPageClickTest homeClick;
    @BeforeMethod
    public void initialization(){ homeClick= PageFactory.initElements(driver, LogInPageClickTest.class); }

    @Test
    public void userNameBoxClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickOn_userNameBox();
    }
    @Test
    public void userPasswordBoxClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickOn_userPasswordBox();
    }
    @Test
    public void logInButtonClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickLogInButton();
    }
    @Test
    public void femalePointerClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickFemalePointer();
    }
    @Test
    public void felameWordClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickFelameWord();
    }
    @Test
    public void faleWordClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickMaleWord();
    }
    @Test
    public void signUpButtonClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeClick.clickSignUpButton();
    }
    @Test
    public void clickOnBirthdayDate() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeXpath("//*[@id=\"day\"]");
    }
    @Test
     public void clickOnBirthdayYear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeCssSecector("#year"); }
    @Test
    public void clickOnLoginButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeXpath("//*[@id=\"u_0_2\"]");
    }
    @Test
    public void clickOnFemalePointer(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeCssSecector("#u_0_9");
    }
    @Test
    public void clickOnFemaleWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeXpath("//*/span[1]/label");
    }
    @Test
    public void clickOnMaleWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeXpath("//*/span[2]/label");
    }
    @Test
    public void clickOnSignUpButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeCssSecector("#u_0_r");
    }
    @Test
    public void clickOnBirthdayMonth(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeCssSecector("#month");
    }
}
