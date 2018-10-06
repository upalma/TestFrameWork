package homePageObjectModule;

import HomePageObjectModule.HoverOverElements;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HoverOver extends HoverOverElements {
    HoverOverElements hover;
    @BeforeMethod
    public void init(){
        hover = PageFactory.initElements(CommonAPI.driver, HoverOverElements.class);
    }
    @Test
    public void testHoverAccountAndListBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hover.hoverOverAccountAndListBox();
    }
    @Test
    public void testHoverDepartments(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hover.hoverOverDepartments();
    }
    @Test
    public void testHoverAmazonTryPrime() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hover.hoverOverAmazonTryPrime();
    }
}
