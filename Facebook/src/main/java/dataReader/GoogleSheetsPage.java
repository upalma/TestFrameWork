package dataReader;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends CommonAPI {

    @FindBy(css ="#email") WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;
    @FindBy (xpath = "//*[@id='globalContainer']/div[3]/div/div/div") WebElement errorMessage;
    @FindBy(id = "u_0_2") WebElement logInButton;
    @FindBy(id="loginbutton") WebElement submitButton;

    public void swithToLogInPage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(4);
        logInButton.click();
    }
    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(userName, row.get(0).toString());
            inputValueInTextBoxByWebElement(userPassword, row.get(1).toString());
            submitButton.submit();
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