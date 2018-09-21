package search;

import base.CommonAPI;
import home.HomePageInputData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestRegistration extends home.Registration {
    @Test
    public void registration() {
        locatorTypeName("firstname","Uzzal");
        locatorTypeCssSecector("#u_0_e","Palma");
        locatorTypeXpath("//*[@id=\"u_0_h\"]","7183759087");
        locatorTypeXpath("//*[@id=\"u_0_l\"]", "abcd1234");
        locatorTypeCssSecector("#month");
        locatorTypeXpath("//*[@id=\"day\"]");
        locatorTypeCssSecector("#year");
        locatorTypeCssSecector("#u_0_7");
        locatorTypeCssSecector("#u_0_r");
    }
}
