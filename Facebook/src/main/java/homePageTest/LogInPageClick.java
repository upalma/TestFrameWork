package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.cssSelector(locator));
    }
    public void locatorTypeId(String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id(locator)).click();
    }
    public void locatorTypeClass(String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.className(locator)).click();
    }
    public void locatorTypeXpath(String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOn_userNameBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOn_userNameBox.click();
    }
    public void clickOn_userPasswordBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOn_userPasswordBox.click();
    }
    public void clickSearchBoxOnMainPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBoxOnMainPage.click();
    }
    public void clickUserProfileName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userProfileName.click();
    }
    public void clickOnBirthdayDate(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        onBirthdayDate.click();
    }
    public void clickOnBirthdayYear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        onBirthdayYear.click();
    }
    public void clickLogInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInButton.click();
    }
    public void clickFemalePointer(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        femalePointer.click();
    }
    public void clickFelameWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        felameWord.click();
    }
    public void clickMaleWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        maleWord.click();
    }
    public void clickSignUpButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpButton.click();
    }
    public void clickOnBirthdayMonth(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OnBirthdayMonth.click();
    }
}
