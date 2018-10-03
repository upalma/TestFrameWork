package homePageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchByArrayList extends SearchByArrayList {
    SearchByArrayList searchByArrayList;

    @BeforeMethod
    public void init (){
        searchByArrayList= PageFactory.initElements(driver, SearchByArrayList.class);
    }
    @Test
    public void SearchWithArrayList(){
        searchByArrayList.getList();
    }
}
