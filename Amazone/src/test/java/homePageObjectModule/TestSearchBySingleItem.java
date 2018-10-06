package homePageObjectModule;

import HomePageObjectModule.SearchBySingleItem;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchBySingleItem extends SearchBySingleItem {
    SearchBySingleItem searchBySingleItem;

    @BeforeMethod
    public void initialization() {
        searchBySingleItem = PageFactory.initElements(driver, SearchBySingleItem.class);
    }
    @Test
    public void searchItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.importDataOnSearchBox();
    }
}
