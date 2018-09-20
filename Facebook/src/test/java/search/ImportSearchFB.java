package search;

import base.CommonAPI;
import home.HomeClick;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImportSearchFB extends HomeClick {
    //positive testing
    @Test
    public void openFacebookBrowser() throws InterruptedException{
        driver.navigate();
        Thread.sleep(5000);
    }
    @Test
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).clear();
        typeOnCssSecector("#email","palma.ub13@gmail.com");
        Thread.sleep(5000);
    }
    @Test
    public void enterFirstNameBox() {
        typeOnName("firstname","Uzzal");
    }
    @Test
    public void enterLastNameBox () {
        typeOnCssSecector("#u_0_e","Palma");
    }
    @Test
    public void insertPhoneNumber(){
        typeOnXpath("//*[@id=\"u_0_h\"]","7183759087");
    }

    @Test
    public void enterNewPassword(){
        typeOnCssSecector("#u_0_o", "abcd1234");
    }

}