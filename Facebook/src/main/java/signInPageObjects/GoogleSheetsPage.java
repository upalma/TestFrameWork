package signInPageObjects;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends CommonAPI {

    @FindBy(css ="#email") WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;
    @FindBy (xpath = "//*[@id=\"globalContainer\"]/div[3]/div/div/div") WebElement errorMessage;
    @FindBy(id = "u_0_2") WebElement logInButton;


    public void clickOnLogInButton() throws InterruptedException {
        sleepFor(4);
        logInButton.click();
    }

    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(userName, row.get(1).toString());
            inputValueInTextBoxByWebElement(userPassword, row.get(2).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(errorMessage));
            System.out.println(getTextByWebElement(errorMessage));
            clearInputBox(userName);
            clearInputBox(userPassword);
            sleepFor(1);
        }
        return actual;
    }
}