package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Click extends CommonAPI {
    @Test
    public void clickOnBirthdayDate()throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"day\"]")).click();
       Thread.sleep(5000);
       }
    @Test
     public void clickOnBirthdayYear()throws InterruptedException{
        driver.findElement(By.cssSelector("#year")).click();
        Thread.sleep(5000);
    }
}
