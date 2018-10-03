package testProductsPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import productsPageObjects.ProductsPage;
import testHomePageObjects.HomePage;

public class TestProductPage extends ProductsPage {
    HomePage objOfHomePage;
    ProductsPage objOfProductsPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfProductsPage = PageFactory.initElements(driver, ProductsPage.class);
    }
     //// T3ALI_PP_TC01 Select tols and filter homePageTest
    @Test(priority = 1, enabled =false)
    public void testCategories() throws InterruptedException {
        objOfHomePage.categories();
        //ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        objOfProductsPage.toolsSearch();
    }
}
