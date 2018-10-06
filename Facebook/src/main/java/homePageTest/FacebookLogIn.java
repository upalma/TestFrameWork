package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FacebookLogIn extends CommonAPI {
    @FindBy(css ="#email") WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;
    @FindBy (xpath = "//*[@id=\"globalContainer\"]/div[3]/div/div/div") WebElement errorMessage;
    @FindBy(id = "u_0_2") WebElement logInButton;

    public void clickLoginButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInButton.click();
    }
    public void inputUserNameAndPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("abcd");
        userPassword.sendKeys("1234", Keys.ENTER);
    }
    public void logInFacebook() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("palub13@yahoo.com");
        userPassword.sendKeys("0170122", Keys.ENTER);
    }
    public void clickLogInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInButton.click();
        String actual = errorMessage.getText();
        System.out.println(actual);
    }
    public String clickLogInButtonwithDataProviser(String email, String passCode) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys(email);
        userPassword.sendKeys(passCode);
        logInButton.click();
        Thread.sleep(2000);
        String actual = errorMessage.getText();
        System.out.println(actual);
        return actual;
    }
}
