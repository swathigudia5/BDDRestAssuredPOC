package stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
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
    public void sendGetRequest(String endpoint) throws URISyntaxException {
        Helper.init();
        RestAssured.baseURI = prop.getProperty("BASE_URL");
        //System.out.println(prop.getProperty("BASE_URL"));
        RequestSpecification requestSpecification = RestAssured.given();
        response = requestSpecification.when().get(new URI(endpoint));
        jsonString = response.asString();
        //System.out.println(jsonString);
    }


    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        int actualResponseCode = response.then().extract().statusCode();
        assertEquals(expectedStatusCode,actualResponseCode);
    }

    @Then("the response should contain {string} {string}")
    public void verifyResponseContainsData(String fieldName,String expectedText) {
        assertTrue(response.getBody().asString().contains(expectedText));
    }


    @Then("the response should contain the latest COVID-19 {string}")
    public void verifyResponseContainLatestCovidCases( String date) {
        JsonPath jsonPath = response.jsonPath();

        int count = jsonPath.getInt("data.size()");

        for(int i=0;i<count;i++)
        {
            String search = jsonPath.getString("data["+i+"].date");
            if(search.equalsIgnoreCase(date))
            {
                String latestCovidCases = jsonPath.getString("data["+i+"].latestBy");
                System.out.println("The date "+date+" is present in the list and the number of coronavirus cases are "+latestCovidCases+"");
                String deathCount = jsonPath.getString("data["+i+"].deathNew");
                System.out.println("The date "+date+" is present in the list and the number of death cases are "+deathCount+"");
            }
        }


    }
    @Then("the error message should be {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
        String responseBody = this.response.getBody().asString();
        assertTrue(responseBody.contains(expectedErrorMessage));

    }

    }







