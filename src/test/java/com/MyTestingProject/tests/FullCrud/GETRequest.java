package com.MyTestingProject.tests.FullCrud;

import com.MyTestingProject.endpoints.APIConstants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequest {

        @Test
        public void Test_Get(){
        RequestSpecification r = RestAssured.given();
        r.baseUri(APIConstants.BASE_URL);
        r.basePath(APIConstants.CREATE_GET_POST_BOOKING_URL);
        r.when().get();
        r.then().statusCode(200);

    }



}
