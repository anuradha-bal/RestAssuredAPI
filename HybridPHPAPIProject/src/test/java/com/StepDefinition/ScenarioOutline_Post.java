package com.StepDefinition;

import com.Data.SetValues_Pojo_Post;
import com.Util.APIUtility;

import org.testng.Assert;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ScenarioOutline_Post extends APIUtility
{
    RequestSpecification re;
    Response response;

    @Given("User has Post Method Details {string} {string} {string}")
    public void user_has_post_method_details(String title, String body, String author) throws IOException
    {
        SetValues_Pojo_Post p = new SetValues_Pojo_Post();
        re = RestAssured.given().spec(requestdetails()).body(p.setValues(title, body, author));

    }

    @When("the user send post HTTP request")
    public void the_user_send_post_http_request()
    {
        response = re.when().post("/api/insert.php");

    }

    @Then("user gets message data inserted succesfully")
    public void user_gets_message_data_inserted_succesfully()
    {
        Assert.assertEquals(response.getStatusCode(), 200);
        // System.out.println(response.asString());
    }

}
