package homePageObjectModule;

import HomePageObjectModule.ClickElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClickElement extends HomePageObjectModule.ClickElement {
    ClickElement findByElement;

    @BeforeMethod
    public void initialization() {
        findByElement = PageFactory.initElements(driver, ClickElement.class);
    }
    @Test
    public void testHover(){
        findByElement.hoverOver();
    }
    @Test
    public void clickOnAccountAndListBox(){
        locatorTypeId("nav-link-accountList");
    }
    @Test
    public void clickOnAccountAndList(){
        locatorTypeXpath("//*[@id=\"nav-link-accountList\"]/span[2]");
    }
    @Test
    public void popUP() {
        driver.navigate();
    }
    @Test
    public void clickOnTopBar1() {
        locatorTypeId("nav-upnav");
    }
    @Test
    public void clickOnTopBar() {
        topBarclick();
    }
    @Test
    public void clickOnAmazonTryPrimeBox1() {
        locatorTypeCss("#nav-logo > a.nav-logo-link > span.nav-sprite.nav-logo-base");
    }
    @Test
    public void clickOnAmazonTryPrimeText() {
        locatorTypeCss("#nav-logo > a.nav-sprite.nav-logo-tagline.nav-prime-try");
    }
    @Test
    public void clickOnLocationIcon1() {
        locatorTypeId("nav-packard-glow-loc-icon");
    }
    @Test
    public void clickOnDeliverToText1() {
        locatorTypeId("glow-ingress-line1");
    }
    @Test
    public void clickOnDeliveyAddressText1() {
        locatorTypeId("glow-ingress-line2");
    }
    @Test
    public void clickOnDeliveryToBox1() {
        locatorTypeCss("#nav-global-location-slot>span>a");
    }
    @Test
    public void clickOnYourAmazonLink1() {
        locatorTypeId("nav-your-amazon");
    }
    @Test
    public void clickOnTodayDealsLink1() {
        locatorTypeCss("#nav-xshop > a:nth-child(3)");
    }
    @Test
    public void clickOnGiftCardLink1() {
        locatorTypeCss("#nav-xshop > a:nth-child(4)");
    }
    @Test
    public void clickOnRegistryLink1() {
        locatorTypeCss("#nav-xshop > a:nth-child(5)");
    }
    @Test
    public void clickOnAll() {
        locatorTypeId("searchDropdownBox");
    }
    @Test
    public void clickOnTreasureTruckLink1() {
        locatorTypeXpath("//*[@id=\"nav-xshop\"]/a[6]");
    }
}
