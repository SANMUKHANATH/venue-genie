package partyStepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getPrice
{
	Response resp;
	ValidatableResponse val;
	
	@When("user want to see the data by using uri {string}")
	public void user_want_to_see_the_data_by_using_uri(String uri) 
	{
	    resp=RestAssured.get(uri);
	}

	@Then("user want to verify the statusLine {string}")
	public void user_want_to_verify_the_status_line(String statusLine) 
	{
	    val=resp.then()
	    		.assertThat().statusLine(statusLine);
	}

	@Then("user want to verify statusCode {int}")
	public void user_want_to_verify_status_code(Integer statusCode) 
	{
	  val.assertThat().statusCode(statusCode);
	  val.log().all();
	}


}




