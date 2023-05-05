package com.MyTestingProject.tests.base;

import com.MyTestingProject.actions.AssertActions;
import com.MyTestingProject.endpoints.APIConstants;
import com.MyTestingProject.modules.Payload_Module_DSe;
import com.MyTestingProject.modules.Payload_Module_Se;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public class baseTest {

    // Common Functionality

    protected RequestSpecification requestSpecification;
    protected AssertActions assertActions = new AssertActions();
    protected Payload_Module_Se payload_module = new Payload_Module_Se();
    protected Payload_Module_DSe payload_module_dSe = new Payload_Module_DSe();
    protected Response response;
    protected ValidatableResponse validatableResponse;

    //Before any Method
    @BeforeMethod
    protected void setup(){
        requestSpecification = new RequestSpecBuilder()
                                    .setBaseUri(APIConstants.BASE_URL)
                                    .addHeader("Content-Type","application/json")
                                    .build().log().all();
    }
}
