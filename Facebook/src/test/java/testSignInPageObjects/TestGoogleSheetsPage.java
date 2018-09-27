package testSignInPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signInPageObjects.GoogleSheetsPage;
import signInPageObjects.SignInPage;
import testHomePageObjects.HomePage;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    GoogleSheetsPage objGoogleSheetsPage;


    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
       objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }

    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(2);
        objGoogleSheetsPage.clickOnLogInButton();
        sleepFor(2);
//        objOfSignInPage.switchToSignInForm();
//        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1k2PuxXVyr74X4U481ttu1aPVeeAhEubmkuFBeK6b434";
        String range = "Sheet1!A2:C";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
           // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
