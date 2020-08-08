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

public class ScenarioOutline_Put extends APIUtility
{
    RequestSpecification re;
    Response response;
    Resources res = new Resources();

    @Given("User has Put Method Details {string} {string}")
    public void user_has_put_method_details(String id, String author) throws IOException
    {
        SetValues_Pojo_Put put = new SetValues_Pojo_Put();
        re = RestAssured.given().spec(requestdetails()).body(put.putValues(id, author));

    }

    @When("the user send put HTTP request")
    public void the_user_send_put_http_request()
    {
        response = re.when().put(res.getPutAPI());
    }

    @Then("user gets message data updateded succesfully")
    public void user_gets_message_data_updateded_succesfully()
    {
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.asString());
    }
}
