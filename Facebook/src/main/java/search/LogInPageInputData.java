package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
        signUpField_firstName.sendKeys("Bright");
    }
    public void inputSignUpDataLastName(){
        signUpField_lastName.sendKeys("Palma");
    }
    public void inputSignUpDataEmail(){
        signUpField_emailAddress.sendKeys("palma.ub13@gmail.com");
    }
    public void inputSignUpDataReEmail(){
        signUpField_ReEnteremailAddress.sendKeys("palma.ub13@gmail.com");
    }
    public void inputSignUpDataNewPassword(){
        signUpField_newPassword.sendKeys("abcd1234");
    }
    public void sexMaleBoxClick (){
        sexMaleBox.click();
    }
    public void selectBirthMonth(String value){
        Select select = new Select(dropdown_Month);
        select.selectByValue(value);
    }
    public void selectBirthDay(String value){
        Select select = new Select(dropdown_Day);
        select.selectByValue(value);
    }
    public void selectBirthYear(String value){
        Select select = new Select(dropdown_Year);
        select.selectByValue(value);
    }
    public void inputSignUpDataMonth(){
        selectBirthMonth("12");
    }
    public void inputSignUpDataYear(){
        selectBirthYear("1998");
    }
    public void inputSignUpDataDay(){
        selectBirthDay("25");
    }
    public void inputUserName(){
        logInField_userName.sendKeys("fkdjfkdjfkjd",Keys.ENTER);
    }
    public void inputUserPassword(){
        logInField_Password.sendKeys("abce1234",Keys.ENTER);
    }

    //value enter method
    public void locatorTypeCssSecector(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeId(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeClass(String locator, String value){
        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeName(String locator, String value){
        driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
    }

}
