package Apitesting;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

public class Apitesting {
	
	
	
	@Test
	public void post_get() {
		
		
		given().queryParam("CUSTOMER_ID","68195")
        .queryParam("PASSWORD","1234!")
        .queryParam("Account_No","1")
        .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
        .body();
	}
	
	@Test
	public void statucode() {
		
		int statusCode= given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		   System.out.println("The response status is "+statusCode);

		   
	}
}
