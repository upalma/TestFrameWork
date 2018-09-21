package search;

import base.CommonAPI;
import home.HomeClick;
import home.HomePageInputData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageInputData extends HomePageInputData {
    //positive testing
    @Test
    public void openFacebookBrowser() throws InterruptedException{
        driver.navigate();
        Thread.sleep(5000);
    }
    @Test
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).clear();
        locatorTypeCssSecector("#email","palma.ub13@gmail.com");
        Thread.sleep(5000);
    }
    @Test
    public void enterFirstNameBox() {
        locatorTypeName("firstname","Uzzal");
    }
    @Test
    public void enterLastNameBox () {
        locatorTypeCssSecector("#u_0_e","Palma");
    }
    @Test
    public void insertPhoneNumber(){
        locatorTypeXpath("//*[@id=\"u_0_h\"]","7183759087");
    }

}