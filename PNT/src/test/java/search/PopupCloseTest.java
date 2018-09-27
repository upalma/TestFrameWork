package search;

import popUp.PopUpHandling;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupCloseTest extends PopUpHandling {
    PopUpHandling popUpHandling;

    @BeforeMethod
    public void initialization() {
        popUpHandling = PageFactory.initElements(driver, PopUpHandling.class);
    }
    @Test
    public void closePopWindow(){
        popUpHandling.closePopUp();
    }
    @Test
    public void clickOnPopupWindow(){
        popUpHandling.popUpWindow();
    }
}

