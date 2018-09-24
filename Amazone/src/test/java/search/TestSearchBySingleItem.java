package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchBySingleItem extends SearchBySingleItem {
    SearchBySingleItem searchBySingleItem;

    @BeforeMethod
    public void initialization() {
        searchBySingleItem = PageFactory.initElements(driver, SearchBySingleItem.class);
    }
    @Test
    public void searchItem(){
        searchBySingleItem.importDataOnSearchBox();
    }
}
