package partycontroller;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class getByName 
{
	
	
	
	@Test
	public void GetByName()
	{
	   RestAssured.when()
	   .get("http://localhost:8080/venues/partyhalls/name/SHANMUKHANATH")
	   
	   
	   .then()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON)
	   .and()
	   .log().all();
		   
		
	   
		
	}

}

