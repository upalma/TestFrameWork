package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LogInNegativePositive extends CommonAPI{
    @FindBy(css = "#email") WebElement userName;
    @FindBy(css="#pass") WebElement password;

    public void logInWithcorrectUserAndPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithCorrectUserAndWrongPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithCorrectUserNameAndNoPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("dkfjkdjfk", Keys.ENTER);
    }
    public void loginInwithNoUserNameAndCorrectPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithWrongUserNameAndCorrectPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithWrongUserNameAndWrongPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithNoUserNameAndNoPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("");
        password.sendKeys("", Keys.ENTER);
    }
}

