package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Registration extends CommonAPI {
    //value enter method
    public void locatorTypeCssSecector(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeId(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeClass(String locator, String value){
        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void locatorTypeName(String locator, String value){
        driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
    }
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
