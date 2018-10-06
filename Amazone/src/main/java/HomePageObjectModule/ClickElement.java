package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ClickElement extends CommonAPI {

    @FindBy(id = "nav-upnav")
    WebElement topBar;
    @FindBy(css = "#nav-logo > a.nav-logo-link > span.nav-sprite.nav-logo-base")
    WebElement amazonTryPrimeBox;
    @FindBy(css = "#nav-logo > a.nav-sprite.nav-logo-tagline.nav-prime-try")
    WebElement amazonTryPrimeText;
    @FindBy(id = "nav-packard-glow-loc-icon")
    WebElement locationIcon;
    @FindBy(id = "glow-ingress-line1")
    WebElement deliverToText;
    @FindBy(id = "glow-ingress-line2")
    WebElement deliveyAddressText;
    @FindBy(css = "#nav-global-location-slot>span>a")
    WebElement deliveryToBox;
    @FindBy(id = "nav-your-amazon")
    WebElement yourAmazonLink;
    @FindBy(css = "#nav-xshop > a:nth-child(3)")
    WebElement todayDealsLink;
    @FindBy(css = "#nav-xshop > a:nth-child(4)")
    WebElement giftCardLink;
    @FindBy(css = "#nav-xshop > a:nth-child(5)")
    WebElement registryLink;
    @FindBy(css = "#//*[@id=\"nav-xshop\"]/a[5]")
    WebElement sellLink;
    @FindBy(css = "#nav-xshop > a:nth-child(7)")
    WebElement treasureTruckLink;
    @FindBy(css = "#nav-xshop > a:nth-child(8)")
    WebElement helpLink;
    @FindBy(id = "nav-link-accountList")
    WebElement AccountAndListBox;
    @FindBy(id = "nav-link-accountList")
    WebElement AccountAndList;
    @FindBy(xpath = "//*[@id=\"nav-al-wishlist\"]/a[3]/span")
    WebElement findaGiftLink;


    //    public void hoverOver(){
//        AccountAndListBox.click();
//    }

    public void topBarClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        topBar.click();
    }
    public void amazonTryPrimeBoxClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonTryPrimeBox.click();
    }
    public void amazonTryPrimeTextClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonTryPrimeText.click();
    }
    public void locationIconClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locationIcon.click();
    }
    public void deliverToTextClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deliverToText.click();
    }
    public void deliveyAddressTextClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deliveyAddressText.click();
    }
    public void deliveryToBoxClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deliveryToBox.click();
    }
    public void yourAmazonLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAmazonLink.click();
    }
    public void todayDealsLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDealsLink.click();
    }
    public void giftCardLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCardLink.click();
    }
    public void registryLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registryLink.click();
    }
    public void sellLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sellLink.click();
    }
    public void treasureTruckLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        treasureTruckLink.click();
    }
    public void helpLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpLink.click();
    }
    public void AccountAndListBoxClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AccountAndListBox.click();
    }
    public void AccountAndListClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AccountAndList.click();
    }
    public void findaGiftLinkClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findaGiftLink.click();
    }
}