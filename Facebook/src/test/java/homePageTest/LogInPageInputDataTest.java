package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LogInPageInputDataTest extends LogInPageInputData {
   LogInPageInputData logInPageInputData;

   @BeforeMethod
   public void initialization(){ logInPageInputData= PageFactory.initElements(driver, LogInPageInputData.class); }

    @Test
    public void openFacebookBrowser() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate();
        Thread.sleep(5000);
    }
    @Test
    public void enterEmailAddress() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.cssSelector("#email")).clear();
        locatorTypeCssSecector("#email","palma.ub13@gmail.com");
        Thread.sleep(5000);
    }
    @Test
    public void enterFirstNameBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeName("firstname","Uzzal");
    }
    @Test
    public void enterLastNameBox () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locatorTypeCssSecector("#u_0_e","Palma");
    }
    @Test
    public void selectBirthDayMonth(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataMonth();
    }
    @Test
    public void selectBirthDayDay(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataDay();
    }
    @Test
    public void selectBirthDayYear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataYear();
    }
    @Test
    public void inputFirstName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataFirstName();
    }
    @Test
    public void inputLastName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataLastName();
    }
    @Test
    public void inputReEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataEmail();
        logInPageInputData.inputSignUpDataReEmail();
    }
    @Test
    public void inputNewPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.inputSignUpDataNewPassword();
    }
    @Test
    public void clickOnsexMaleBox (){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInPageInputData.sexMaleBoxClick();
    }
}