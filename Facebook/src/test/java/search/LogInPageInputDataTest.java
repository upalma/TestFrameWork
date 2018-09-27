package search;

import popUpTest.LogInPageInputData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageInputDataTest extends LogInPageInputData {
   LogInPageInputData logInPageInputData;

   @BeforeMethod
   public void initialization(){ logInPageInputData= PageFactory.initElements(driver, LogInPageInputData.class); }

    @Test
    public void openFacebookBrowser() throws InterruptedException{
        driver.navigate();
        Thread.sleep(5000);
    }
    @Test
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).clear();
        locatorTypeCssSecector("#email","palma.ub13@gmail.com");
        Thread.sleep(5000);
    }
    @Test
    public void enterFirstNameBox() {
        locatorTypeName("firstname","Uzzal");
    }
    @Test
    public void enterLastNameBox () {
        locatorTypeCssSecector("#u_0_e","Palma");
    }
    @Test
    public void selectBirthDayMonth(){
        logInPageInputData.inputSignUpDataMonth();
    }
    @Test
    public void selectBirthDayDay(){
        logInPageInputData.inputSignUpDataDay();
    }
    @Test
    public void selectBirthDayYear(){
        logInPageInputData.inputSignUpDataYear();
    }
    @Test
    public void inputFirstName(){
        logInPageInputData.inputSignUpDataFirstName();
    }
    @Test
    public void inputLastName(){
        logInPageInputData.inputSignUpDataLastName();
    }
    @Test
    public void inputEmail(){

    }
    @Test
    public void inputReEmail(){
        logInPageInputData.inputSignUpDataEmail();
        logInPageInputData.inputSignUpDataReEmail();
    }
    @Test
    public void inputNewPassword(){
        logInPageInputData.inputSignUpDataNewPassword();
    }
    @Test
    public void clickOnsexMaleBox (){
        logInPageInputData.sexMaleBoxClick();
    }
}