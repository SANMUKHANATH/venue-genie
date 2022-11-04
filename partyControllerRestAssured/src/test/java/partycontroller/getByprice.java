package partycontroller;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getByprice
{
	
	
	@Test
	public void getByPrice()
	{
		
		RestAssured.when()
		.get("http://localhost:8080/venues/weddinghalls?high=1000.00&low=500.00")
		
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.and()
		.log().all();
		
		
	}

}



