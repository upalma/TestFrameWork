package search;

import base.CommonAPI;
import home.HomeClick;
import home.HomeLogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePageClick extends HomeClick {
//HomeClick homeClick;
//    @BeforeMethod
//    public void initialization(){ homeClick= PageFactory.initElements(driver, HomeClick.class); }
    @Test
    public void clickOnBirthdayDate() {
        locatorTypeXpath("//*[@id=\"day\"]");
    }
    @Test
     public void clickOnBirthdayYear(){ locatorTypeCssSecector("#year"); }
    @Test
    public void clickOnLoginButton() {
        locatorTypeXpath("//*[@id=\"u_0_2\"]");
    }
    @Test
    public void clickOnFemalePointer(){
        locatorTypeCssSecector("#u_0_9");
    }
    @Test
    public void clickOnFemaleWord(){
        locatorTypeXpath("//*/span[1]/label");
    }
    @Test
    public void clickOnMalePointer(){
      locatorTypeId("u_0_7");
    }
    @Test
    public void clickOnMaleWord(){
        locatorTypeXpath("//*/span[2]/label");
    }
    @Test
    public void clickOnSignUpButton(){
        locatorTypeCssSecector("#u_0_r");
    }
    @Test
    public void clickOnBirthdayMonth(){
        locatorTypeCssSecector("#month");
    }
}
