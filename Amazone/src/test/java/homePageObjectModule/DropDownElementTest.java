package homePageObjectModule;

import HomePageObjectModule.DropDownElement;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DropDownElementTest extends DropDownElement {
    @BeforeMethod
    public void init(){
        DropDownElement obj = PageFactory.initElements(driver, DropDownElement.class);
    }
    @Test
    public void test1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareWithDB();
    }
}
