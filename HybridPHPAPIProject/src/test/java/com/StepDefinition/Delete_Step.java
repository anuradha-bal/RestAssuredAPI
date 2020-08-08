package com.StepDefinition;

import com.Data.SetValues_Pojo_Delete;
import com.Util.APIUtility;
import com.Util.Resources;

import org.testng.Assert;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Step extends APIUtility
{
    RequestSpecification re;
    Response response;
    Resources res = new Resources();

    @Given("The user has Delete method details")
    public void the_user_has_delete_method_details() throws IOException
    {

        SetValues_Pojo_Delete del = new SetValues_Pojo_Delete();
        re = RestAssured.given().spec(requestdetails()).body(del.deleteValues());

    }

    @When("the user call Delete API with delete HTTP method")
    public void the_user_call_delete_api_with_delete_http_method()
    {
        response = re.when().delete(res.getDeleteAPI());

    }

    @Then("the user receive message successfully deleted")
    public void the_user_receive_message_successfully_deleted()
    {
        Assert.assertEquals(response.asString(), "{\"message\":\"Post Deleted Successfully\"}");
        System.out.println(response.asString());
    }

}
