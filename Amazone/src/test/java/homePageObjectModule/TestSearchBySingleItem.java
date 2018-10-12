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
    public void searchItemIphone(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchForIphone();
    }
    @Test
    public void searchItemLaptop() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchLaptop();
    }
    @Test
    public void searchItemMobileCase() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchMobileCase();
    }
    @Test
    public void searchItemSoap() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchSoap();
    }
    @Test
    public void searchItemSuger() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchSuger();
    }
    @Test
    public void searchItemTissue() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchTissue();
    }
    @Test
    public void searchItemUnderWare() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBySingleItem.searchUnderWare();
    }
}
