package dataReader;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LogInByExcelDataReader extends CommonAPI {
    @FindBy(id = "u_0_2") WebElement homeLogInButton;
    @FindBy(id ="email") WebElement userName;
    @FindBy(id="pass") WebElement userPassword;
    @FindBy (id = "loginbutton") WebElement logInButton;
    @FindBy (xpath = "//*[@id=\"globalContainer\"]/div[3]/div/div/div") WebElement errorMessage;

    public void clickLogInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogInButton.click();
        String actual = errorMessage.getText();
        System.out.println(actual);
    }

    public String clickLogInButtonwithDataProviser(String email, String passCode) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogInButton.click();
        userName.sendKeys(email);
        userPassword.sendKeys(passCode);
        logInButton.click();
        Thread.sleep(2000);
        String actual = errorMessage.getText();
        System.out.println(actual);
        return actual;
    }
}


