package GETBasics;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class VerifyMultipleValidations {
	
	
	// here we are validating the Header
	
	@Test
	public void VerifyResponse()
	{
		RestAssured.baseURI= "https://maps.googleapis.com" ;
		
		//https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=cruise&key=AIzaSyDZ2vidS_eeUVWgBmwJReChtfBPbDyBWCg
		
		Response response = given().param("location", "-33.8670522,151.1957362").
		given().param("radius", "500").
		given().param("type", "restaurant").
		given().param("key", "AIzaSyDZ2vidS_eeUVWgBmwJReChtfBPbDyBWCg").
		
		when().get("/maps/api/place/nearbysearch/json").
		
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("results[-10].name", equalTo("Cafe Morso")).extract().response();
		//.and().body("results[9].name", equalTo("Harbour Spirit Thai Restaurant and Bar"))
		//.and().body("results[9].name", equalTo("Sokyo"))
		
	
		/*.and().body("results[2].name", equalTo("Sydney New Year's Eve Cruises"))*/
		System.out.println("---------------------------------------");
		System.out.println(response.asString());
		System.out.println("---------------------------------------");
	
		//.and().body("results[20].vicinity", equalTo("80 Pyrmont Street, Pyrmont"))
		//.and().header("server", "scaffolding on HTTPServer2");
		//System.out.println("request executed susccessfully");
		
		/*RestAssured.baseURI = "https://maps.googleapis.com";
		RequestSpecification httpRequest = RestAssured.given();
		io.restassured.response.Response response = httpRequest.get("/maps/api/place/nearbysearch/json");
	 
		// Retrieve the body of the Response
		ResponseBody body = ((ResponseOptions<io.restassured.response.Response>) response).getBody();
	 
		// By using the ResponseBody.asString() method, we can convert the  body
		// into the string representation.
		System.out.println("Response Body is: " + body.asString());*/
		
		
		


}

}
