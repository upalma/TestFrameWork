package popUp;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class PopUpHandling extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"modal_subscribe\"]/div/div/div[1]/button/span/i")
    WebElement popUpWindoX;
    @FindBy (xpath = "//img[contains(text(),'PeopleNTech')]")
    WebElement popUpWindow;

    public void closePopUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popUpWindoX.click();
    }
    public void popUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popUpWindow.click();
    }
}
