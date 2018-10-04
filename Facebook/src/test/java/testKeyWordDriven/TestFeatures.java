package testKeyWordDriven;

import KeyWordDriven.Features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestFeatures extends Features {

    Features objOfFeatures;
    @BeforeMethod
    public void initializeObjects(){
        objOfFeatures = PageFactory.initElements(CommonAPI.driver, Features.class);
    }
    @Test
    public void fbLogInWithKeyWordDriven() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfFeatures.selectFeature();
    }
}
