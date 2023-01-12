package team_Request_Model;


import static io.restassured.RestAssured.given;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class client {
	
	public static Response createTeam(Royal_Challengers_Model royal_Challengers_Model ) {
		
		RequestSpecification request= given().header("authorization", "Bearer ")
		         .contentType(ContentType.JSON)
		         .body(royal_Challengers_Model);
		     return   request.post("") ;
	}
	
public static Response getTeam(String id ) {
		
		RequestSpecification request= given().header("authorization", "Bearer ")
		         .pathParam("id", id);
		     return   request.get("/team/{id}/") ;
	}

}
