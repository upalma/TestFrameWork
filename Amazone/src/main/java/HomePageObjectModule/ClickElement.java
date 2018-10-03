package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(className = "#nav-al-wishlist")
    WebElement findaGiftLink;

    //    public void hoverOver(){
//        AccountAndListBox.click();
//    }
    public void hoverOver() {
        Actions actions = new Actions(driver);
        actions.moveToElement(AccountAndListBox).perform();
        actions.moveToElement(findaGiftLink).click().perform();
    }

    public void topBarClick() {
        topBar.click();
    }
    public void amazonTryPrimeBoxClick() {
        amazonTryPrimeBox.click();
    }
    public void amazonTryPrimeTextClick() {
        amazonTryPrimeText.click();
    }
    public void locationIconClick() {
        locationIcon.click();
    }
    public void deliverToTextClick() {
        deliverToText.click();
    }
    public void deliveyAddressTextClick() {
        deliveyAddressText.click();
    }
    public void deliveryToBoxClick() {
        deliveryToBox.click();
    }
    public void yourAmazonLinkClick() {
        yourAmazonLink.click();
    }
    public void todayDealsLinkClick() {
        todayDealsLink.click();
    }
    public void giftCardLinkClick() {
        giftCardLink.click();
    }
    public void registryLinkClick() {
        registryLink.click();
    }
    public void sellLinkClick() {
        sellLink.click();
    }
    public void treasureTruckLinkClick() {
        treasureTruckLink.click();
    }
    public void helpLinkClick() {
        helpLink.click();
    }
    public void AccountAndListBoxClick() {
        AccountAndListBox.click();
    }
    public void AccountAndListClick() {
        AccountAndList.click();
    }
    public void findaGiftLinkClick() {
        findaGiftLink.click();
    }
}