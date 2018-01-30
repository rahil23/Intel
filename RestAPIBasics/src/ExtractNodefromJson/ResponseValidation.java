package ExtractNodefromJson;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseValidation {

	static String BASEURI = "https://maps.googleapis.com";
	// here we are validating the Header
	public static void main(String a[])
	{
		String requestBody="{"+
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
"}";
		RestAssured.baseURI= "https://maps.googleapis.com" ;
		
		Response res = 
		given().queryParam("key", "AIzaSyCncICEr-92vT3-HzOqkEtUBRgxsErx6DU")
		
		.body(requestBody).
		when().post("/maps/api/place/add/json").
		
		then().assertThat().statusCode(200).and().
		extract().response();
		
		System.out.println(res.asString());
		//System.out.println(res);  // this is the object value. we need to convert the response in String
		
		//System.out.println(res.asString()); // thiss will change the value of refrences in String format
		
		//System.out.println(res.jsonPath());
		
		String response = res.asString();
		
		JsonPath jsonResponse = new JsonPath(response);
		//System.out.println(jsonResponse);
		String placeId=jsonResponse.get("place_id");
		System.out.println(placeId);
		
		
	
}

}
