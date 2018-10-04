package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchBySingleItem extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    public void importDataOnSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("iphone", Keys.ENTER);

    }
}
