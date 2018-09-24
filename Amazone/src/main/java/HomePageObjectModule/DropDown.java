package HomePageObjectModule;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends CommonAPI {
    @FindBy(id = "searchDropdownBox") WebElement allBeforeSearchBox;


}
