package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignInAmazon extends CommonAPI {

    @FindBy(id = "nav-link-accountList") WebElement accountAndList;
    @FindBy(id = "createAccountSubmit") WebElement createYourAmazonAccount;
    @FindBy(id = "ap_customer_name") WebElement enterYourName;
    @FindBy(id = "ap_email") WebElement enterYourEmail;
    @FindBy(id = "ap_password") WebElement enterYourPassword;
    @FindBy(id = "ap_password_check") WebElement reEnterYourPassword;
    @FindBy(id = "continue") WebElement submitCreateYourAmazonAccount;
    @FindBy(id = "continue") WebElement continueNextPage;
    @FindBy(id= "signInSubmit") WebElement submit;

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
    public void signInToAmazone(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        accountAndList.click();
        enterYourEmail.sendKeys("palma.ub13@gmail.com");
        continueNextPage.click();
        enterYourPassword.sendKeys("abdckdjf");
        submit.submit();
    }
}
