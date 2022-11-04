package partyStepDefinations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class getAll{

	RequestSpecification req;
	Response resp;
	ValidatableResponse val;
	
@When("user want to fetch the data by using uri {string}")
	public void user_want_to_fetch_the_data_by_using_uri(String string) 
	{
	   resp=RestAssured.get(string);
	}

	@Then("User want to verify the statusLine {string}")
	public void user_want_to_verify_the_status_line(String string1) 
	{
	    val=resp.then()
	    		.assertThat().statusLine(string1);
	}

	@Then("user want to verify the statuscode {int}")
	public void user_want_to_verify_the_statuscode(Integer int1) 
	{
	    val.assertThat().statusCode(int1);
	}


}


