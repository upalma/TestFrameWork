package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInNegativePositive extends CommonAPI{
    @FindBy(css = "#email") WebElement userName;
    @FindBy(css="#pass") WebElement password;

    public void logInWithcorrectUserAndPassword() {
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithCorrectUserAndWrongPassword(){
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithCorrectUserNameAndNoPassword() {
        userName.sendKeys("dkfjkdjfk", Keys.ENTER);
    }
    public void loginInwithNoUserNameAndCorrectPassword() {
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithWrongUserNameAndCorrectPassword() {
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithWrongUserNameAndWrongPassword() {
        userName.sendKeys("dkfjkdjfk");
        password.sendKeys("jdfkdj kfj", Keys.ENTER);
    }
    public void loginInWithNoUserNameAndNoPassword() {
        userName.sendKeys("");
        password.sendKeys("", Keys.ENTER);
    }
}

