package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchByArrayList extends SearchByArrayList {
    SearchByArrayList searchByArrayList;

    @BeforeMethod
    public void init (){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByArrayList= PageFactory.initElements(driver, SearchByArrayList.class);
    }
    @Test
    public void SearchWithArrayList(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByArrayList.getList();
    }
}
