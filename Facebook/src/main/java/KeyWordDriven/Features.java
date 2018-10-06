package KeyWordDriven;

import base.CommonAPI;
import homePageTest.FacebookLogIn;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;

public class Features extends CommonAPI {

    FacebookLogIn facebookLogIn = PageFactory.initElements(CommonAPI.driver,FacebookLogIn.class);
    //KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException {
        facebookLogIn.clickLoginButton();
        facebookLogIn.inputUserNameAndPassword();
    }
    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromKeyWordExcelFile(String fileName) throws IOException {
        String path = "../Facebook/data/" +fileName;
        String [] outPut = reader.colReader(path, 2);
        return outPut;
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = getDataFromKeyWordExcelFile("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}

