package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomeClick extends CommonAPI {
    //Click method
    public void locatorTypeCssSecector(String locator){
        driver.findElement(By.cssSelector(locator));
    }
    public void locatorTypeId(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void locatorTypeClass(String locator){
        driver.findElement(By.className(locator)).click();
    }
    public void locatorTypeXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
}
