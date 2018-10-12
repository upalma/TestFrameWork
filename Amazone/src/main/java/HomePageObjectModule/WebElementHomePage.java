package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WebElementHomePage extends CommonAPI {

    @FindBy(id = "nav-upnav")
    org.openqa.selenium.WebElement topBar;
    @FindBy(css = "#nav-logo > a.nav-logo-link > span.nav-sprite.nav-logo-base")
    org.openqa.selenium.WebElement amazonTryPrimeBox;
    @FindBy(css = "#nav-logo > a.nav-sprite.nav-logo-tagline.nav-prime-try")
    org.openqa.selenium.WebElement amazonTryPrimeText;
    @FindBy(id = "nav-packard-glow-loc-icon")
    org.openqa.selenium.WebElement locationIcon;
    @FindBy(id = "glow-ingress-line1")
    org.openqa.selenium.WebElement deliverToText;
    @FindBy(id = "glow-ingress-line2")
    org.openqa.selenium.WebElement deliveyAddressText;
    @FindBy(css = "#nav-global-location-slot>span>a")
    org.openqa.selenium.WebElement deliveryToBox;
    @FindBy(id = "nav-your-amazon")
    org.openqa.selenium.WebElement yourAmazonLink;
    @FindBy(css = "#nav-xshop > a:nth-child(3)")
    org.openqa.selenium.WebElement todayDealsLink;
    @FindBy(css = "#nav-xshop > a:nth-child(4)")
    org.openqa.selenium.WebElement giftCardLink;
    @FindBy(css = "#nav-xshop > a:nth-child(5)")
    org.openqa.selenium.WebElement registryLink;
    @FindBy(css = "#//*[@id=\"nav-xshop\"]/a[5]")
    org.openqa.selenium.WebElement sellLink;
    @FindBy(css = "#nav-xshop > a:nth-child(7)")
    org.openqa.selenium.WebElement treasureTruckLink;
    @FindBy(css = "#nav-xshop > a:nth-child(8)")
    org.openqa.selenium.WebElement helpLink;
    @FindBy(id = "nav-link-accountList")
    org.openqa.selenium.WebElement AccountAndListBox;
    @FindBy(id = "nav-link-accountList")
    org.openqa.selenium.WebElement AccountAndList;
    @FindBy(xpath = "//*[@id=\"nav-al-wishlist\"]/a[3]/span")
    org.openqa.selenium.WebElement findaGiftLink;

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