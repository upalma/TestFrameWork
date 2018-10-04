package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class NewFacebookSignUp extends CommonAPI {

    @FindBy(css ="#email") WebElement logIn_userName;
    @FindBy(css="#pass") WebElement logIn_Password;
    @FindBy(name="firstname") WebElement signUpField_firstName;
    @FindBy(name="lastname") WebElement signUpField_lastName;
    @FindBy(name="reg_email__") WebElement signUpField_emailAddress;
    @FindBy(name="reg_email_confirmation__") WebElement signUpField_ReEnteremailAddress;
    @FindBy(name="reg_passwd__") WebElement signUpField_newPassword;
    @FindBy(id="month") WebElement dropdown_Month;
    @FindBy(id="day") WebElement dropdown_Day;
    @FindBy(id="year") WebElement dropdown_Year;
    @FindBy(xpath = "//*/span[2]/label") WebElement sexMaleBox;
    @FindBy(css = "#u_0_r") WebElement submitButton;

    public void selectBirthMonth(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(dropdown_Month);
        select.selectByValue(value);
    }
    public void selectBirthDay(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(dropdown_Day);
        select.selectByValue(value);
    }
    public void selectBirthYear(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(dropdown_Year);
        select.selectByValue(value);
    }

    public void inputSignUpData(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_firstName.sendKeys("Bright");
        signUpField_lastName.sendKeys("Palma");
        signUpField_emailAddress.sendKeys("palma.ub13@gmail.com");
        signUpField_ReEnteremailAddress.sendKeys("palma.ub13@gmail.com");
        signUpField_newPassword.sendKeys("abcd1234");
        selectBirthMonth("12");
        selectBirthDay("25");
        selectBirthYear("1998");
        sexMaleBox.click();
        submitButton.submit();
    }
    public void setText_logInuserName(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logIn_userName.sendKeys(text);
        Assert.assertEquals(logIn_userName.getAttribute("value"),text);
    }
    public void setText_logInPassword(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logIn_Password.sendKeys(text);
        Assert.assertEquals(logIn_Password.getAttribute("value"),text);
    }
    public void setText_signUpField_firstName(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_firstName.sendKeys(text);
        Assert.assertEquals(signUpField_firstName.getAttribute("value"),text);
    }
    public void setText_signUpField_lastName(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_lastName.sendKeys(text);
        Assert.assertEquals(signUpField_lastName.getAttribute("value"),text);
    }
    public void setText_signUpField_emailAddress(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_emailAddress.sendKeys(text);
        Assert.assertEquals(signUpField_emailAddress.getAttribute("value"),text);
    }
    public void setText_signUpField_ReEnteremailAddress(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_ReEnteremailAddress.sendKeys(text);
        Assert.assertEquals(signUpField_ReEnteremailAddress.getAttribute("value"),text);
    }
    public void setText_signUpField_newPassword(String text){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_newPassword.sendKeys(text);
        Assert.assertEquals(signUpField_newPassword.getAttribute("value"),text);
    }
}
