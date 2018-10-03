package homePageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import popUp.HandlePopUp;

public class TestPopUpHandle extends HandlePopUp {
    HandlePopUp handlePopUp;
    @Test
    public void popUpHandle()throws InterruptedException{
         handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}