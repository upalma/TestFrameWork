package jSonServer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostResource {
    @Test
    public void postTest(){
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", 14);
        jsonObject.put("title", " zuzzal");
        jsonObject.put("author", "Hira");

        request.body(jsonObject.toJSONString());
        Response response = request.post("http://localhost:3000/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,201);
    }
    @Test
    public void deletePost() {
       //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/posts/12");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void putPost() {
       //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 13);
        jsonObject.put("title", "Mr. abcd");
        jsonObject.put("author", "Simpson");

        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/12");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void putNullPost() {
      //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", 999);
        jsonObject.put("title", "Huckleberry Fin");
        jsonObject.put("author", "Homer Simpson");

        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/999");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
}

