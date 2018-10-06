package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DropDownTest extends DropDownMonths {

    @BeforeMethod
    public void init(){
        DropDownMonths obj = PageFactory.initElements(driver, DropDownMonths.class);
    }
    @Test
    public void MonthDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareWithDB();
    }
}
