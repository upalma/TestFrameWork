package search;

import base.CommonAPI;
import home.HomeClick;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomeClick extends HomeClick {
    @Test
    public void clickOnBirthdayDate() {
        typeOnXpath("//*[@id=\"day\"]");
    }
    @Test
     public void clickOnBirthdayYear(){
        typeOnCssSecector("#year");
    }
    @Test
    public void clickOnLoginButton() {
        typeOnXpath("//*[@id=\"u_0_2\"]");
    }
    @Test
    public void clickOnFemalePointer(){
        typeOnClass("#u_0_9");
    }
    @Test
    public void clickOnFemaleWord(){
        typeOnXpath("//*/span[1]/label");
    }
    @Test
    public void clickOnMalePointer(){
        typeOnClass("#u_0_a");
    }
    @Test
    public void clickOnMaleWord(){
        typeOnXpath("//*/span[2]/label");
    }
    @Test
    public void clickOnLogUpButton(){
        typeOnClass("#u_0_u");
       }
    @Test
    public void clickOnBirthdayMonth(){
        typeOnCssSecector("#month");
    }
}
