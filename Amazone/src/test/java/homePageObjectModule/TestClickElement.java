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
    public void popUP() {
        driver.navigate();
    }
    @Test
    public void clickOnTopBar1() {
        locatorTypeId("nav-upnav");
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
//    @Test
//    public void clickOnSellLink1() {
//        locatorTypeXpath("//*[@id=\"nav-xshop\"]/a[5]");
//    }
//    @Test
//    public void clickOnTreasureTruckLink1() {
//        locatorTypeXpath("//*[@id=\"nav-xshop\"]/a[6]");
//    }
//    @Test
//    public void clickOnHelpLink1() {
//        locatorTypeCss("/Help");
//    }

//    @Test
//    public void clickOnTopBar() {
//        findByElement.topBarClick();
//    }
//    @Test
//    public void clickOnAmazonTryPrimeBox() {
//        findByElement.amazonTryPrimeBoxClick();
//    }
//    @Test
//    public void clickOnLocationIcon() {
//        findByElement.locationIconClick();
//    }
//    @Test
//    public void clickOnDeliverToText() {
//        findByElement.deliverToTextClick();
//    }
//    @Test
//    public void clickOnDeliveyAddressText() {
//        findByElement.deliveyAddressTextClick();
//    }
//    @Test
//    public void clickOnDeliveryToBox() {
//        findByElement.deliverToBoxClick();
//    }
//    @Test
//    public void clickOnYourAmazonLink() {
//        findByElement.yourAmazonLinkClick();
//    }
//    @Test
//    public void clickOnTodayDealsLink() {
//        findByElement.todayDealsLinkClick();
//    }
//    @Test
//    public void clickOnTreasureTruckLink() {
//        findByElement.treasureTruckLinkClick();
//    }
//    @Test
//    public void clickOnCellLink() {
//        findByElement.cellLinkClick();
//    }
//    @Test
//    public void clickOnGiftCardLink() {
//        findByElement.giftCardLinkClick();
//    }
//    @Test
//    public void clickOnRegistryLink() {
//        findByElement.registryLinkClick();
//    }
//    @Test
//    public void clickOnHelpLink() {
//        findByElement.helpLinkClick();
//    }
}
