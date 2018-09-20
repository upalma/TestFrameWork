package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomeClick extends CommonAPI {
    //Click method
    public void typeOnCssSecector(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void typeOnId(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void typeOnClass(String locator){
        driver.findElement(By.className(locator)).click();
    }
    public void typeOnXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    //value enter method
    public void typeOnCssSecector(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnId(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnClass(String locator, String value){
        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnName(String locator, String value){
        driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
    }
}
