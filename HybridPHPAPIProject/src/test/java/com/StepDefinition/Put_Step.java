package com.StepDefinition;

import com.Data.SetValues_Pojo_Put;
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

public class Put_Step extends APIUtility
{

    RequestSpecification re;
    Response response;
    Resources res = new Resources();

    @Given("The user has Put method details")
    public void the_user_has_put_method_details() throws IOException
    {
        SetValues_Pojo_Put put = new SetValues_Pojo_Put();
        re = RestAssured.given().spec(requestdetails()).body(put.putValues());

    }

    @When("the user call Put API with put HTTP method")
    public void the_user_call_put_api_with_put_http_method()
    {
        response = re.when().put(res.getPutAPI());

    }

    @Then("the user receive message successfully updated")
    public void the_user_receive_message_successfully_upadted()
    {
        Assert.assertEquals(response.asString(), "{\"message\":\"Data updated successfully\"}");
        System.out.println(response.asString());
    }

}
