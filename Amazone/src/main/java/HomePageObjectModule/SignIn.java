package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends CommonAPI {

    @FindBy(id = "nav-link-accountList") WebElement accountAndList;
    @FindBy(id = "createAccountSubmit") WebElement createYourAmazonAccount;
    @FindBy(id = "ap_customer_name") WebElement enterYourName;
    @FindBy(id = "ap_email") WebElement enterYourEmail;
    @FindBy(id = "ap_password") WebElement enterYourPassword;
    @FindBy(id = "ap_password_check") WebElement reEnterYourPassword;
    @FindBy(id = "continue") WebElement submitCreateYourAmazonAccount;

    public void createAccount(){
        accountAndList.click();
        createYourAmazonAccount.click();
        enterYourName.sendKeys("Uzzal");
        enterYourEmail.sendKeys("abcd@gmail.com");
        enterYourPassword.sendKeys("abcd");
        reEnterYourPassword.sendKeys("abcd");
        submitCreateYourAmazonAccount.submit();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }
}
