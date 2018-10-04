package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class LogInPageInputData extends CommonAPI {
    @FindBy(css ="#email") WebElement logInField_userName;
    @FindBy(css="#pass") WebElement logInField_Password;
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

    public void inputSignUpDataFirstName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_firstName.sendKeys("Bright");
    }
    public void inputSignUpDataLastName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_lastName.sendKeys("Palma");
    }
    public void inputSignUpDataEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_emailAddress.sendKeys("palma.ub13@gmail.com");
    }
    public void inputSignUpDataReEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_ReEnteremailAddress.sendKeys("palma.ub13@gmail.com");
    }
    public void inputSignUpDataNewPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpField_newPassword.sendKeys("abcd1234");
    }
    public void sexMaleBoxClick (){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sexMaleBox.click();
    }
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
    public void inputSignUpDataMonth(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBirthMonth("12");
    }
    public void inputSignUpDataYear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBirthYear("1998");
    }
    public void inputSignUpDataDay(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBirthDay("25");
    }
    public void inputUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInField_userName.sendKeys("fkdjfkdjfkjd",Keys.ENTER);
    }
    public void inputUserPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInField_Password.sendKeys("abce1234",Keys.ENTER);
    }

    //value enter method
    public void locatorTypeCssSecector(String locator, String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeId(String locator, String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeClass(String locator, String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeXpath(String locator, String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeName(String locator, String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
    }

}
