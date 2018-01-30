package GETBasics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;




public class GetSample {
	
	static String BASEURI = "https://maps.googleapis.com";
	
	public static void main(String a[])
	{
		RestAssured.baseURI= BASEURI ;
		
		given().param("location", "-33.8670522,151.1957362").
		given().param("radius", "500").
		given().param("type", "restaurant").
		given().param("key", "AIzaSyBb").
		
		when().get("/maps/api/place/nearbysearch/json").
		
		then().assertThat().statusCode(200);
		System.out.println("request executed susccessfully");
		

		
		
	}

}
