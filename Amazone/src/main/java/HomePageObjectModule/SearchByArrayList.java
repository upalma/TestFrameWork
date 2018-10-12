package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
import utility.ConnectDB;

import java.util.ArrayList;
import java.util.List;

import static HomePageObjectModule.DropDownElement.dropDownAll;

public class SearchByArrayList extends CommonAPI {
    ConnectDB objDB = new ConnectDB();
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    public void importDataOnSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("iphone", Keys.ENTER);
    }

    public List<String> listOfItems() {
        List<String> list = new ArrayList<>();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        list.add("iPhone");
        list.add("Computer");
        list.add("Watch");
        list.add("TissueBox");
        list.add("Sunglass");
        list.add("Chair");
        list.add("Coffee");
        return list;
    }

    public void getList() {
        for (String st : listOfItems()) {
            List<String> actualList = objDB.readFromMongoDB("searchBox", "listOfItems");
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            searchBox.sendKeys(st, Keys.ENTER);
            searchBox.clear();
            for (int i = 0; i < actualList.size(); i++) {
                objDB.insertToMongoDB("dropDownAll", "DropDownList", dropDownAll);
                Assert.assertEquals(actualList.get(i), dropDownAll.getText());
            }
        }
    }
}
