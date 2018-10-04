package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;
import utility.ConnectDB;
import java.util.List;

public class DropDown extends CommonAPI {
    ConnectDB objDB = new ConnectDB();
    @FindBy(css = ".nav-search-dropdown.searchSelect")
    public static WebElement dropDown;
    public List<WebElement> getOptions(){
        Select dropDownSelect = new Select(dropDown);
        List<WebElement> dropDownList = dropDownSelect.getOptions();
        return dropDownList;
    }
    public void compareWithDB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> expectedList = getOptions();
        List<String> actualList = objDB.readFromMongoDB("DropDown","DropDownList");
        for (int i=0; i<actualList.size();i++){
           // objDB.insertToMongoDB("DropDown","DropDownList",it);
            Assert.assertEquals(actualList.get(i),expectedList.get(i).getText());
        }
    }
}
