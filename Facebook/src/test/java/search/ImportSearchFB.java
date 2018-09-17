package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ImportSearchFB extends CommonAPI {
    @Test
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).clear();
        driver.findElement(By.cssSelector("#email")).sendKeys("palma.ub13@gmail.com", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void searcFirstNameBox() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Uzzal", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void searchLastNameBox () throws InterruptedException{
        driver.findElement(By.cssSelector("#u_0_e")).sendKeys("Palma", Keys.ENTER);
        Thread.sleep(5000);
    }
}