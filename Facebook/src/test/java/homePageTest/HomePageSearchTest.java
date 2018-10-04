package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageSearchTest extends HomePageSearch {
    HomePageSearch homePageSearch;

    @BeforeMethod
    public void initialized (){
        homePageSearch = PageFactory.initElements(driver, HomePageSearch.class);
    }
    @Test
    public void inputDataInHomeSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageSearch.logInFacebook();
        homePageSearch.inputDataOnSearchBox();
    }
    @Test
    public void clickOnMainPageProfileName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageSearch.logInFacebook();
        homePageSearch.clickOnProfileName();
    }
}
