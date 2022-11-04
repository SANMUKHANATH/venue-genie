package partyStepDefinations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getbyName
{
	
	Response resp;
	ValidatableResponse val;
	
	@When("User Want to Fetch the data by using the URI {string}")
	public void user_want_to_fetch_the_data_by_using_the_uri(String uri)
	{
		resp=RestAssured.get(uri);
	    
	}



	@Then("User Want to validate the StatusCode {int}")
	public void user_want_to_validate_the_status_code(Integer statusCode)
	{
		val=resp.then();
	   val.assertThat().statusCode(statusCode).log().all();
	}


}



