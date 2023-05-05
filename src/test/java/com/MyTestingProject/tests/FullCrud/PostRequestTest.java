package com.MyTestingProject.tests.FullCrud;

import com.MyTestingProject.endpoints.APIConstants;
import com.MyTestingProject.tests.base.baseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequestTest extends baseTest {

@Test
    public void Test_Post_CreateBooking() throws JsonProcessingException {
        requestSpecification.basePath(APIConstants.CREATE_GET_POST_BOOKING_URL);
       // requestSpecification.body(payload_module.createPayload());
        //response = requestSpecification.when().post();
        response = RestAssured.given().spec(requestSpecification)
            .when().body(payload_module.createPayload()).post();
        // Printing complete log
        validatableResponse = response.then().log().all();
        // Using restassured lib
        validatableResponse.statusCode(200);
        // Using JsonPath and TestNG assert
        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingid = jsonPath.getString("bookingid");
        Assert.assertNotNull(bookingid);
        // Using Pojo class object


}
}
