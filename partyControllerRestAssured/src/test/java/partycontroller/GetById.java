package partycontroller;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import io.restassured.http.ContentType;

public class GetById 
{
	@Test
	public void getById() 
	{
		RestAssured.when()
		.get("http://localhost:8080/venues/partyhalls/id/35")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all();
		
		
		
	}
}
