package com.StepDefinition;

import com.Data.SetValues_Pojo_Post;
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

public class Post_Step extends APIUtility
{
    RequestSpecification req;
    Response response;
    Resources res = new Resources();

    @Given("User has Post Method Details")
    public void user_has_post_method_details() throws IOException
    {
        SetValues_Pojo_Post sv = new SetValues_Pojo_Post();
        req = RestAssured.given().spec(requestdetails()).body(sv.setValues());

    }

    @When("User calls Post API with Post HTTP method")
    public void user_calls_post_api_with_post_http_method()
    {
        response = req.when().post(res.getPostAPI());
    }

    @Then("User receive Post Status code success")
    public void user_receive_post_status_code_success()
    {
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.asString());
    }
}
