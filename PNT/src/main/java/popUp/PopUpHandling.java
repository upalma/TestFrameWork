package popUp;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopUpHandling extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"modal_subscribe\"]/div/div/div[1]/button/span/i")
    WebElement popUpWindoX;
    @FindBy (xpath = "//img[contains(text(),'PeopleNTech')]")
    WebElement popUpWindow;

    public void closePopUp(){
        popUpWindoX.click();
    }
    public void popUpWindow(){
        popUpWindow.click();
    }
}
