package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HoverOverElements extends CommonAPI {

    @FindBy(id = "nav-link-accountList")
    WebElement AccountAndListBox;
    @FindBy(id = "nav-link-accountList")
    WebElement findaGiftLink;
    @FindBy (css = "#nav-link-shopall > span.nav-line-2")
    WebElement departments;
    @FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
    WebElement fireTv;
    @FindBy (css = "#nav-logo > a.nav-sprite.nav-logo-tagline.nav-prime-try")
    WebElement amazonTryPrimeBox;
    @FindBy (xpath = "//*[@id=\"nav-prime-tooltip\"]/div[3]/a")
    WebElement getStartedLink;


    public void hoverOverAccountAndListBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(AccountAndListBox).perform();
        actions.moveToElement(findaGiftLink).click().perform();
    }
    public void hoverOverDepartments(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(departments).perform();
        actions.moveToElement(fireTv).click().perform();
    }
    public void hoverOverAmazonTryPrime() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(amazonTryPrimeBox).perform();
        actions.moveToElement(getStartedLink).click().perform();
        Thread.sleep(3000);
    }
}
