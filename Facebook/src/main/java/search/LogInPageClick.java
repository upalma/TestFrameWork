package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageClick extends CommonAPI {

    @FindBy(css = "#email") WebElement clickOn_userNameBox;
    @FindBy(css = "#email") WebElement clickOn_userPasswordBox;
    @FindBy (className = "_1frb") WebElement searchBoxOnMainPage;
    @FindBy(className="_3ixn\"") WebElement userProfileName;
    @FindBy(xpath = "//*[@id=\"day\"]") WebElement onBirthdayDate;
    @FindBy(xpath = "//*[@id=\"day\"]") WebElement onBirthdayYear;
    @FindBy (xpath = "//*[@id=\"u_0_2\"]") WebElement logInButton;
    @FindBy(css="#u_0_9") WebElement femalePointer;
    @FindBy(xpath = "//*/span[1]/label") WebElement felameWord;
    @FindBy(xpath = "//*/span[2]/label") WebElement maleWord;
    @FindBy (css = "#u_0_r") WebElement signUpButton;
    @FindBy(css="#month") WebElement OnBirthdayMonth;

    //Click method
    public void locatorTypeCssSecector(String locator){
        driver.findElement(By.cssSelector(locator));
    }
    public void locatorTypeId(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void locatorTypeClass(String locator){
        driver.findElement(By.className(locator)).click();
    }
    public void locatorTypeXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOn_userNameBox(){
        clickOn_userNameBox.click();
    }
    public void clickOn_userPasswordBox(){
        clickOn_userPasswordBox.click();
    }
    public void clickSearchBoxOnMainPage(){
        searchBoxOnMainPage.click();
    }
    public void clickUserProfileName(){
        userProfileName.click();
    }
    public void clickOnBirthdayDate(){
        onBirthdayDate.click();
    }
    public void clickOnBirthdayYear(){
        onBirthdayYear.click();
    }
    public void clickLogInButton(){
        logInButton.click();
    }
    public void clickFemalePointer(){
        femalePointer.click();
    }
    public void clickFelameWord(){
        felameWord.click();
    }
    public void clickMaleWord(){
        maleWord.click();
    }
    public void clickSignUpButton(){
        signUpButton.click();
    }
    public void clickOnBirthdayMonth(){
        OnBirthdayMonth.click();
    }
}
