package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.Helper;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;
public class GetRequestStep extends Helper {


    private Response response;
    private static String jsonString;


    @Given("the API endpoint {string}")
    public void theAPIEndpoint(String endpoint) throws URISyntaxException {
        Helper.init();
        RestAssured.baseURI = prop.getProperty("BASE_URL");
        System.out.println(prop.getProperty("BASE_URL"));
        RequestSpecification requestSpecification = RestAssured.given();
        response = requestSpecification.when().get(new URI(endpoint));
        jsonString = response.asString();
    }

    @When("a GET request is sent")
    public void aGETRequestIsSent() {
        response = RestAssured.given().get();
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
        System.out.println(response.getStatusCode());
    }

    @Then("the response should contain {string}")
    public void theResponseShouldContain(String expectedText) {
        assertTrue(response.getBody().asString().contains(expectedText));
    }
}
