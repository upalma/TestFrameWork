package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchByArrayList extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox") WebElement searchBox;

    public void importDataOnSearchBox() {
        searchBox.sendKeys("iphone", Keys.ENTER);
    }
    public List<String> listOfItems() {
        List<String> list = new ArrayList<>();
        list.add("iPhone");
        list.add("Computer");
        list.add("Watch");
        list.add("TissueBox");
        list.add("Sunglass");
        list.add("Chair");
        list.add("Coffee");
        return list;
    }
    public void getList(){
        for(String st: listOfItems()){
            searchBox.sendKeys(st, Keys.ENTER);
            searchBox.clear();
        }

    }
}
