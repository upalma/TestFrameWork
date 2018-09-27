package search;

import popUpTest.LogInPageClick;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageClickTest extends LogInPageClick {
LogInPageClickTest homeClick;
    @BeforeMethod
    public void initialization(){ homeClick= PageFactory.initElements(driver, LogInPageClickTest.class); }

    @Test
    public void userNameBoxClick(){
        homeClick.clickOn_userNameBox();
    }
    @Test
    public void userPasswordBoxClick(){
        homeClick.clickOn_userPasswordBox();
    }
    @Test
    public void logInButtonClick(){
        homeClick.clickLogInButton();
    }
    @Test
    public void femalePointerClick(){
        homeClick.clickFemalePointer();
    }
    @Test
    public void felameWordClick(){
        homeClick.clickFelameWord();
    }
    @Test
    public void faleWordClick(){
        homeClick.clickMaleWord();
    }
    @Test
    public void signUpButtonClick(){
        homeClick.clickSignUpButton();
    }
    @Test
    public void clickOnBirthdayDate() {
        locatorTypeXpath("//*[@id=\"day\"]");
    }
    @Test
     public void clickOnBirthdayYear(){ locatorTypeCssSecector("#year"); }
    @Test
    public void clickOnLoginButton() {
        locatorTypeXpath("//*[@id=\"u_0_2\"]");
    }
    @Test
    public void clickOnFemalePointer(){
        locatorTypeCssSecector("#u_0_9");
    }
    @Test
    public void clickOnFemaleWord(){
        locatorTypeXpath("//*/span[1]/label");
    }
    @Test
    public void clickOnMaleWord(){
        locatorTypeXpath("//*/span[2]/label");
    }
    @Test
    public void clickOnSignUpButton(){
        locatorTypeCssSecector("#u_0_r");
    }
    @Test
    public void clickOnBirthdayMonth(){
        locatorTypeCssSecector("#month");
    }
}
