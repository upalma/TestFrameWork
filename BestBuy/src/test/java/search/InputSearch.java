package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

    @Test
    public void search() throws InterruptedException {
    driver.findElement(By.xpath("")).click();
    Thread.sleep(5000);
    }
}
