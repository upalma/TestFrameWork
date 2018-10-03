package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogIn extends CommonAPI {
    @FindBy(css ="#email") WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;
    @FindBy (xpath = "//*[@id=\"globalContainer\"]/div[3]/div/div/div") WebElement errorMessage;
    @FindBy(id = "u_0_2") WebElement logInButton;

    public void logInFacebook() {
        userName.sendKeys("palub13@yahoo.com");
        userPassword.sendKeys("0170122", Keys.ENTER);
    }
    public void clickLogInButton(){
        logInButton.click();
        String actual = errorMessage.getText();
        System.out.println(actual);
    }

    public String clickLogInButtonwithDataProviser(String email, String passCode) throws InterruptedException {
        userName.sendKeys(email);
        userPassword.sendKeys(passCode);
        logInButton.click();
        Thread.sleep(2000);
        String actual = errorMessage.getText();
        System.out.println(actual);
        return actual;
    }



}
