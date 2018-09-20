package search;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends LogIn{

    LogIn logIn = new LogIn();

@Test
    public void clickHome() throws InterruptedException {
        super.logIn();
        driver.findElement(By.className("_1vp5")).click();
        Thread.sleep(5000);
    }
}
