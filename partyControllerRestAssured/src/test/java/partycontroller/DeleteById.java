package partycontroller;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteById
{
	
	@Test
	public void deleteById()
	{
		
		RestAssured.when()
		.delete("http://localhost:8080/venues/partyhalls/20 ")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(404)
		.and()
		.log().all();
		
	}

}




