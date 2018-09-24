package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class SearchByExcelFile extends CommonAPI {

//    DataReader dtr = new DataReader();
//    //T3ALI_BE _TC01
//    public String[] getDataCol2(String fileName) throws IOException {
//        String path = "../AliBaba/data/" + fileName;
//        String[] output = dtr.colReader(path, 2); //col 2 = email
//        return output;
//    }
//    //T3ALI_BE _TC01
//    public String[] getDataCol3(String fileName) throws IOException {
//        String path = "../AliBaba/data/" + fileName;
//        String[] output = dtr.colReader(path, 3); //col 3 = password
//        return output;
//    }
//    //T3ALI_BE _TC01
//    public String[] getAssertData(String fileName) throws IOException {
//        String path = "../AliBaba/data/" + fileName;
//        String[] output = dtr.colReader(path, 4);
//        return output;
//    }
//
//    //T3ALI_BE _TC01 LogIn by using excel sheet data
//    public String[] getVerificationValue(String fileName) throws IOException, InterruptedException {
//        String[] col2Value = getDataCol2(fileName);
//        String[] col3Value = getDataCol3(fileName);
//        String[] actual = new String[col2Value.length];
//        for (int i = 0; i < col2Value.length; i++) {
//            inputValueInTextBoxByWebElement(account, col2Value[i]);
//            sleepFor(5);
//            inputValueInTextBoxByWebElement(password, col3Value[i]);
//            sleepFor(5);
//            // actual[i] = getCurrentPageTitle();
//            actual[i] = getTextByWebElement(signInErrorMesage);
//            sleepFor(5);
//            System.out.println(actual[i]);
//            clearInputBox(account);
//            clearInputBox(password);
//        }
//        return actual;
//    }
//    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
//        String path = "../AliBaba/data/" + fileName;
//        String[] output = dtr.colReader(path, 2); //col 2 = email
//        return output;
//    }

}
