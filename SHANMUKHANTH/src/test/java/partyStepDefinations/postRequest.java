package partyStepDefinations;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static  io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class postRequest 


{
	RequestSpecification resp;
	Response shan;
	ValidatableResponse anju;
	
	
	
	
	@Given("User Want to Create data in the data base")
	public void user_want_to_create_data_in_the_data_base() 
	
	
	{
		
		
		JSONObject a=new JSONObject();
		a.put("capacity", 11);
		a.put("foodType", "  biryani");
		
        a.put("liquor","mca" );
		a.put("location","plvd");
		a.put( "name", "nath");
		a.put("parking" ,6500);
		a.put("menuPricePerPlate",4500);
		a.put("noOfPeoples" , 12);
		a.put("status", "created");
		a.put("parking",56);
		
		
	    resp = RestAssured.given()
	    .body (a)
	    .contentType(ContentType.JSON);
	}

	
	@When("User able to Pass the data by using URI  {string}")
	public void user_able_to_pass_the_data_by_using_uri(String uri) {
	   shan=resp.post(uri);
	}

	@Then("uSer Want to Verify StatusLine {string}")
	public void u_ser_want_to_verify_status_line(String string) {
	    anju=shan.then()
	    		.assertThat().statusLine(string);
	}

	@Then("UsER Want to VerFY StatuscOde {int}")
	public void us_er_want_to_ver_fy_statusc_ode(Integer int1) {
	    anju.assertThat().statusCode(int1);
	}

}










