package com.StepDefinition;

import com.Util.APIUtility;
import com.Util.Resources;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Step extends APIUtility
{
    RequestSpecification re;
    Response response;
    Resources res = new Resources();

    @Given("The user has Get method details")
    public void the_user_has_get_method_details()
    {
        re = RestAssured.given().baseUri("https://www.change2testautomation.com/").header("Content-Type", "application/json");

    }

    @When("the user call Get API with Get HTTP method")
    public void the_user_call_get_api_with_get_http_method()
    {
        response = re.when().get(res.getGetAPI());
    }

    @Then("the user received the details")
    public void the_user_received_the_details()
    {
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.asString());
    }
}
