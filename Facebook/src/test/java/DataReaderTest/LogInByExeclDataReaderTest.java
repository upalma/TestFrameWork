package DataReaderTest;

import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import dataReader.LogInByExcelDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByExeclDataReaderTest extends LogInByExcelDataReader {
    LogInByExcelDataReader dataReader;
    @BeforeMethod
    public void initialization() {
        dataReader = PageFactory.initElements(driver, LogInByExcelDataReader.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "supplyData")
    public void loginTestByDataProvider(String email, String passCode,String message) throws InterruptedException {
        TestLogger.log("email" + email);
        TestLogger.log("passCode" + passCode);
        TestLogger.log("message" + message);
        String actual=dataReader.clickLogInButtonwithDataProviser(email,passCode);
        Assert.assertEquals(actual, message);
        TestLogger.log("Test-Passed");
    }
}
