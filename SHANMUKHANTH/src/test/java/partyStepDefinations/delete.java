package partyStepDefinations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class delete
{
	Response resp;
	ValidatableResponse val;
	
	@When("User want to remove the data by the ID using the uri {string}")
	public void user_want_to_remove_the_data_by_the_id_using_the_uri(String uri)
	{
		resp=RestAssured.delete(uri);
	    
	}
    @Then("User validate that statusLine {string}")
	public void user_validate_that_status_line(String statusLine)
	{
	  val=resp.then()
			  .assertThat().statusLine(statusLine);
	}

	@Then("user able to verify the statusCode {int}")
	public void user_able_to_verify_the_status_code(Integer statusCode)
	{
        val.assertThat().statusCode(statusCode);
	}}



