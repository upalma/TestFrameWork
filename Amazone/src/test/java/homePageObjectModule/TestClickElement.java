package homePageObjectModule;

import HomePageObjectModule.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClickElement extends WebElement {
    WebElement clickElement;

    @BeforeMethod
    public void initialization() {
        clickElement = PageFactory.initElements(driver, WebElement.class);
    }
    @Test
    public void clickTopBar(){
        clickElement.topBarClick();
    }
    @Test
    public void clickAmazonTryPrimeBox(){
    clickElement.amazonTryPrimeBoxClick();
    }
    @Test
    public void clickAmazonTryPrimeText(){
    clickElement.amazonTryPrimeTextClick();
    }
    @Test
    public void clickLocationIcon(){
    clickElement.locationIconClick();
    }
    @Test
    public void clickDeliverToText(){
    clickElement.deliverToTextClick();
    }
    @Test
    public void clickDeliveyAddressText(){
    clickElement.deliveyAddressTextClick();
    }
    @Test
    public void clickDeliveryToBox(){
    clickElement.deliveryToBoxClick();
    }
    @Test
    public void clickYourAmazonLink(){
    clickElement.yourAmazonLinkClick();
    }
    @Test
    public void clickTodayDealsLink(){
    clickElement.todayDealsLinkClick();
    }
    @Test
    public void clickGiftCardLink(){
    clickElement.giftCardLinkClick();
    }
    @Test
    public void clickRegistryLink(){
    clickElement.registryLinkClick();
    }
    @Test
    public void clickSellLink(){
    clickElement.sellLinkClick();
    }
    @Test
    public void clickTreasureTruckLink(){
    clickElement.treasureTruckLinkClick();
    }
    @Test
    public void clickHelpLink(){
    clickElement.helpLinkClick();
    }
    @Test
    public void clickAccountAndListBox(){
    clickElement.AccountAndListBoxClick();
    }
    @Test
    public void clickAccountAndList(){
    clickElement.AccountAndListClick();
    }
    @Test
    public void clickFindaGiftLink(){
    clickElement.findaGiftLinkClick();
    }
}
