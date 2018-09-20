package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LogIn extends CommonAPI {
    //positive testing
    @Test
    public void openFacebookBrowser() throws InterruptedException{
        driver.navigate();
        Thread.sleep(5000);
    }
    //login positive testing: correct user name and correct password
    @Test
    public void logIn()throws InterruptedException{
        driver.findElement(By.cssSelector("#email")).sendKeys("ub13@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("abfjdf");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    //login negative testing: correct user name and wrong password
    @Test
    public void logIn1()throws InterruptedException{
        driver.findElement(By.cssSelector("#email")).sendKeys("kfj kdjfkj d");
        driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    //login negative testing: correct user name and no password
    @Test
    public void logIn2()throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).sendKeys("fjjtiji rkjg");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    //login negative testing: no user name and correct password
    @Test
    public void logIn3()throws InterruptedException{
        driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    //login negative testing: wrong user name and correct password((found bug))
    @Test
    public void logIn4()throws InterruptedException{
        driver.findElement(By.cssSelector("#email")).sendKeys("f jkdjfkd jfk");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1234asdf");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    //login negative testing: wrong user name and wrong password
    @Test
    public void logIn5()throws InterruptedException{
        driver.findElement(By.cssSelector("#email")).sendKeys("ertirt riim");
        driver.findElement(By.cssSelector("#pass")).sendKeys("acd1234");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
    //login negative testing: no user name and no password
    @Test
    public void logIn6()throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);
    }
}

