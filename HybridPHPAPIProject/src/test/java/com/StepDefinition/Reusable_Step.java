
package com.StepDefinition;

import static org.junit.Assert.assertEquals;

import com.Data.PayloadDetails;
import com.Data.SetValues_Pojo_Delete;
import com.Data.SetValues_Pojo_Post;
import com.Data.SetValues_Pojo_Put;
import com.Util.APIResources;
import com.Util.APIUtility;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reusable_Step extends APIUtility
{
    RequestSpecification re;
    Response response;

    @Given("The User has API method details")
    public void the_user_has_api_method_details() throws IOException
    {
        re = RestAssured.given().spec(requestdetails());

    }

    @When("The User use {string} and {string} method")
    public void the_user_use_and_method(String resource, String method)
    {
        APIResources postresource = APIResources.valueOf(resource);
        if (method.equalsIgnoreCase("Post")) {
            SetValues_Pojo_Post p = new SetValues_Pojo_Post();
            response = re.body(p.setValues()).when().post(postresource.getResource());

        } else if (method.equalsIgnoreCase("Put")) {
            SetValues_Pojo_Put p = new SetValues_Pojo_Put();
            response = re.body(p.putValues()).when().put(postresource.getResource());
        } else if (method.equalsIgnoreCase("Delete")) {
            SetValues_Pojo_Delete p = new SetValues_Pojo_Delete();
            response = re.body(p.deleteValues()).when().delete(postresource.getResource());

        } else if (method.equalsIgnoreCase("Get")) {
            response = re.when().get(postresource.getResource());
        } else if (method.equalsIgnoreCase("PostPayload")) {
            PayloadDetails p = new PayloadDetails();
            response = re.body(p.postPayLoad()).when().post(postresource.getResource());
        } else if (method.equalsIgnoreCase("PutPayload")) {
            PayloadDetails p = new PayloadDetails();
            response = re.body(p.putPayLoad()).when().put(postresource.getResource());
        } else if (method.equalsIgnoreCase("DeletePayload")) {
            PayloadDetails p = new PayloadDetails();
            response = re.body(p.deletePayLoad()).when().delete(postresource.getResource());
        }
    }

    @Then("The {string} in the response body is {string}")
    public void the_in_the_response_body_is(String keyvalue, String Expectedvalue)
    {
        String res = response.asString();
        System.out.println(res);
        JsonPath js = new JsonPath(res);
        assertEquals(js.get(keyvalue).toString(), Expectedvalue);
        System.out.println(response.asString());
    }

}
