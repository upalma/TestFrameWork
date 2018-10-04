package homePageTest;

import base.CommonAPI;
import popUp.PopUpHandling;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PopupCloseTest extends PopUpHandling {
    PopUpHandling popUpHandling;

    @BeforeMethod
    public void initialization() {
        popUpHandling = PageFactory.initElements(driver, PopUpHandling.class);
    }
    @Test
    public void closePopWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popUpHandling.closePopUp();
    }
    @Test
    public void clickOnPopupWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popUpHandling.popUpWindow();
    }
}

