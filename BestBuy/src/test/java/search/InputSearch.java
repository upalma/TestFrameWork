package search;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public class InputSearch extends CommonAPI {
    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.cssSelector("#header > div:nth-child(2) > div.primary-wrap > ul > li.cart > a")).click();
        Thread.sleep(5000);
    }
//    @Test
//    public void search1() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[1]/a")).sendKeys("iPhone", Keys.ENTER);
//        Thread.sleep(5000);
//    }
}
