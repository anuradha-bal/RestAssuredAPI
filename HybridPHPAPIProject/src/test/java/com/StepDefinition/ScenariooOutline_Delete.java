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

public class ScenariooOutline_Delete extends APIUtility
{
    RequestSpecification re;
    Response response;

    @Given("User has delete Method Details {string}")
    public void user_has_delete_method_details(String id) throws IOException
    {
        SetValues_Pojo_Delete del = new SetValues_Pojo_Delete();
        re = RestAssured.given().spec(requestdetails()).body(del.deleteValues(id));

    }

    @When("the user send delete HTTP request")
    public void the_user_send_delete_http_request()
    {
        Resources res = new Resources();
        response = re.when().delete(res.getDeleteAPI());
    }

    @Then("user gets message data deleted succesfully")
    public void user_gets_message_data_deleted_succesfully()
    {
        Assert.assertEquals(response.asString(), "{\"message\":\"Post Deleted Successfully\"}");
        System.out.println(response.asString());
    }
}
