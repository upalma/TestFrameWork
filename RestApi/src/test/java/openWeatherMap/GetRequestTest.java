package openWeatherMap;

import base.CommonAPI;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static io.restassured.RestAssured.get;

public class GetRequestTest {

    public static String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

    @Test
    public void testResponseCode(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int status = get(url).getStatusCode();
        Assert.assertEquals(status,200);
    }
    @Test
    public void testResponseTime(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        long time = get(url).getTime();
        Assert.assertTrue(time > 0.0);
    }
    @Test
    public void testResponseCity(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JsonPath jsonPathEvaluator = get(url).jsonPath();
        String city = jsonPathEvaluator.get("name");
        Assert.assertEquals(city,"London");
    }
    @Test
    public void testResponseID(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JsonPath jsonPathEvaluator = get(url).jsonPath();
        int id = jsonPathEvaluator.get("id");
        Assert.assertEquals(id,2643743);
    }
}