package homePageTest;

import HomePageObjectModule.DropDown;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DropDownTest extends DropDown {
    @BeforeMethod
    public void init(){
        DropDown obj = PageFactory.initElements(driver,DropDown.class);
    }
    @Test
    public void test1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareWithDB();
    }
}
