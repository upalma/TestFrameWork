package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchBySingleItem extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    public void searchForIphone() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("iphone", Keys.ENTER);

    }
    public void searchTissue() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Tissue", Keys.ENTER);

    }
    public void searchSoap() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Soap", Keys.ENTER);

    }
    public void searchSuger() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Suger", Keys.ENTER);

    }
    public void searchUnderWare() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Under Ware", Keys.ENTER);

    }
    public void searchMobileCase() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Mobile Case", Keys.ENTER);

    }
    public void searchLaptop() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Laptop", Keys.ENTER);
    }
}
