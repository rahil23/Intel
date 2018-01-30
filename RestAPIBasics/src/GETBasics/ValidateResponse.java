package GETBasics;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import scala.Equals;

public class ValidateResponse {
static String BASEURI = "https://maps.googleapis.com";
	// here we are validating the Header
	public static void main(String a[])
	{
		RestAssured.baseURI= BASEURI ;
		
		given().param("location", "-33.8670522,151.1957362").
		given().param("radius", "500").
		given().param("type", "restaurant").
		given().param("key", "AIzaSyDZ2vidS_eeUVWgBmwJReChtfBPbDyBWCg").
		
		when().get("/maps/api/place/nearbysearch/json").
		
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
		.and().body("results[0].name", equalTo("Sydney Showboats"));
		System.out.println("request executed susccessfully");
		


}
}