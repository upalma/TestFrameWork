package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBySingleItem extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    public void importDataOnSearchBox() {
        searchBox.sendKeys("iphone", Keys.ENTER);

    }
}
