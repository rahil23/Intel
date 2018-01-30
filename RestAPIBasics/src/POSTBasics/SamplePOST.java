package POSTBasics;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.TreeMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SamplePOST {
	static String BASEURI = "https://maps.googleapis.com";
	// here we are validating the Header
	public static void main(String a[])
	{
		/*String Payload = "{"+
				"\"location\": { "+
				"\"lat\": -33.8669710,"+
				"\"lng\": 151.1958750"+
				"},"+
				"\"accuracy\": 50,"+
				"\"name\": \"Google Shoes!\","+
				"\"phone_number\": \"(02) 9374 4000\","+
				"\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				"\"types\": [\"shoe_store\"],"+
				"\"website\": \"http://www.google.com.au/\","+
				"\"language\": \"en-AU\""+
"}";*/
		RestAssured.baseURI= "https://maps.googleapis.com" ;
		given().queryParam("key", "AIzaSyDLmBZYVdHRRvzkpk3gOausEeiH97Ip010")
	//.header(arg0)  --> likw this we can send header parameter	
		.body("{"+
				"\"location\": { "+
				"\"lat\": -33.8669710,"+
				"\"lng\": 151.1958750"+
				"},"+
				"\"accuracy\": 50,"+
				"\"name\": \"Google Shoes!\","+
				"\"phone_number\": \"(02) 9374 4000\","+
				"\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				"\"types\": [\"shoe_store\"],"+
				"\"website\": \"http://www.google.com.au/\","+
				"\"language\": \"en-AU\""+
"}").
		
		//https://maps.googleapis.com/maps/api/place/add/json?key=AIzaSyDLmBZYVdHRRvzkpk3gOausEeiH97Ip010
			
			
	
		
		when().post("/maps/api/place/add/json").
		
		then().assertThat().statusCode(200).and().body("status", equalTo("OK"));
		System.out.println("passed");
		
		/*.and().contentType(ContentType.JSON)
		.and().body("results[0].name", equalTo("Sydney Showboats"));
		System.out.println("request executed susccessfully");*/
		
		
		

}

}
