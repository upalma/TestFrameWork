package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickElement extends CommonAPI {

    @FindBy(id="nav-upnav") WebElement topBar;
    @FindBy(css="#nav-logo > a.nav-logo-link > span.nav-sprite.nav-logo-base") WebElement amazonTryPrimeBox;
    @FindBy(css="#nav-logo > a.nav-sprite.nav-logo-tagline.nav-prime-try") WebElement amazonTryPrimeText;
    @FindBy(id="nav-packard-glow-loc-icon") WebElement locationIcon;
    @FindBy(id="glow-ingress-line1") WebElement deliverToText;
    @FindBy(id="glow-ingress-line2") WebElement deliveyAddressText;
    @FindBy(css="#nav-global-location-slot>span>a") WebElement deliveryToBox;
    @FindBy(id="nav-your-amazon") WebElement yourAmazonLink;
    @FindBy(css="#nav-xshop > a:nth-child(3)") WebElement todayDealsLink;
    @FindBy(css="#nav-xshop > a:nth-child(4)") WebElement giftCardLink;
    @FindBy(css="#nav-xshop > a:nth-child(5)") WebElement registryLink;
    @FindBy(css="#//*[@id=\"nav-xshop\"]/a[5]") WebElement sellLink;
    @FindBy(css="#nav-xshop > a:nth-child(7)") WebElement treasureTruckLink;
    @FindBy(css="#nav-xshop > a:nth-child(8)") WebElement helpLink;
    @FindBy(id="nav-link-accountList") WebElement AccountAndListBox;
    @FindBy(id="nav-link-accountList") WebElement AccountAndList;
    @FindBy(className = "#nav-al-wishlist") WebElement clickOnFindaGift;

//    public void hoverOver(){
//        AccountAndListBox.click();
//    }
    public void hoverOver(){
        Actions actions = new Actions(driver);
        actions.moveToElement(AccountAndListBox).perform();
        actions.moveToElement(clickOnFindaGift).click().perform();
}
    public void topBarClick(){
        driver.findElement(By.id("nav-upnav"));
    }
    public void topBarclick(){
        topBar.click();
    }
    public void amazonTryPrimeBoxClick(){
        driver.findElement(By.className("hm-icon nav-sprite")).click();

    }
    public void amazonTryPrimeText() {
        amazonTryPrimeText.click();
    }
    public void deliverToText() {
        deliverToText.click();
    }
    public void amazonTryPrimeTextClick() {
        driver.findElement(By.className("nav-sprite nav-logo-base"));
    }
    public void locationIconClick(){
        driver.findElement(By.id("nav-packard-glow-loc-icon")).click();
    }
    public void deliverToTextClick(){
        driver.findElement(By.id("glow-ingress-line1"));
    }
    public void deliveyAddressTextClick(){
        driver.findElement(By.id("glow-ingress-line2"));
    }
    public void deliverToBoxClick(){
        driver.findElement(By.className("nav-a nav-a-2 a-popover-trigger a-declarative"));
    }
    public void yourAmazonLinkClick(){
        driver.findElement(By.id("nav-your-amazon"));
    }
    public void todayDealsLinkClick(){
        driver.findElement(By.linkText("Today's Deals"));
    }
    public void giftCardLinkClick(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)"));
    }
    public void registryLinkClick(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)"));
    }
    public void cellLinkClick(){
        driver.findElement(By.cssSelector("#//*[@id=\"nav-xshop\"]/a[5]"));
    }
    public void treasureTruckLinkClick(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)"));
    }
    public void helpLinkClick(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
    }
    public void locatorTypeCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void locatorTypeId(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void locatorTypeXpath(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void locatorTypeClass(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void locatorTypeLinkText(String locator){
        driver.findElement(By.id(locator)).click();
    }
}
