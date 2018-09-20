package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImportSearchFB extends CommonAPI {
    //positive testing
    @Test
    public void openFacebookBrowser() throws InterruptedException{
        driver.navigate();
        Thread.sleep(5000);
    }
    @Test
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).clear();
        driver.findElement(By.cssSelector("#email")).sendKeys("palma.ub13@gmail.com", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void clickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    @Test
    public void enterFirstNameBox() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Uzzal", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void enterLastNameBox () throws InterruptedException{
        driver.findElement(By.cssSelector("#u_0_e")).sendKeys("Palma", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void insertPhoneNumber() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("7183759087", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void clickOnBirthdayMonth()throws InterruptedException{
        driver.findElement(By.cssSelector("#month")).click();
        Thread.sleep(5000);
    }
    @Test
    public void enterNewPassword()throws InterruptedException{
        driver.findElement(By.cssSelector("#u_0_o")).sendKeys("abcd1234", Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void clickOnFemalePointer()throws InterruptedException{
        driver.findElement(By.cssSelector("#u_0_9")).click();
        Thread.sleep(5000);
    }
    @Test
    public void clickOnFemaleWord()throws InterruptedException{
        driver.findElement(By.xpath("//*/span[1]/label")).click();
        Thread.sleep(5000);
    }
    @Test
    public void clickOnMalePointer()throws InterruptedException{
        driver.findElement(By.cssSelector("#u_0_a")).click();
        Thread.sleep(5000);
    }
    @Test
    public void clickOnMaleWord()throws InterruptedException{
        driver.findElement(By.xpath("//*/span[2]/label")).click();
        Thread.sleep(5000);
    }
    @Test
    public void clickOnLogUpButton()throws InterruptedException {
        driver.findElement(By.cssSelector("#u_0_u")).click();
        Thread.sleep(5000);
    }
}