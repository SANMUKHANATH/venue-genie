package partycontroller;
import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postRequest

{
	@Test
	public void postRequest()
	{
		JSONObject a=new JSONObject();
		a.put("capacity", 10);
		{
			a.put("capacity",15);
			a.put ("foodType", "chicken  biryani");
			a.put ("id", 2);
			a.put ("liquor", "mca");
			a.put ("location", "pulivendula");
			a.put ("menuPricePerPlate",7000);
			a.put("name", "siri");
			a.put("noOfPeople", 7);
			a.put("parking", 15);
			a.put ("status","created");
			}
		
		given()
		.contentType(ContentType.JSON)
		.body(a)
		
		.when()
		.post("http://localhost:8080/venues/partyhalls")
		
		.then()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all();
		
		
		
		
		
	}

	
	
	

}



