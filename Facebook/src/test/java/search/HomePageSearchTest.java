package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageSearchTest extends HomePageSearch {
    HomePageSearch homePageSearch;

    @BeforeMethod
    public void initialized (){
        homePageSearch = PageFactory.initElements(driver, HomePageSearch.class);
    }
    @Test
    public void inputDataInHomeSearchBox() {
        homePageSearch.logInFacebook();
        homePageSearch.inputDataOnSearchBox();
    }
    @Test
    public void clickOnMainPageProfileName(){
        homePageSearch.logInFacebook();
        homePageSearch.clickOnProfileName();
    }
}
