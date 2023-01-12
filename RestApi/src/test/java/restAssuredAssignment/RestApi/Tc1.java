package restAssuredAssignment.RestApi;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import team_Request_Model.RCB_Fixture;
import team_Request_Model.Royal_Challengers_Model;
import team_Request_Model.client;

public class Tc1 {

	RCB_Fixture rcbFixture;
	Royal_Challengers_Model royal_Challengers_Model;
	Response response;
	// RestAssured.baseURI = "";

	@Test
	public void verifyTeamHasFourForeignPlayer() {

		// Given
		RCB_Fixture fixture = new RCB_Fixture();
		royal_Challengers_Model = fixture.createChallengersRequest();

		// when
		response = client.createTeam(royal_Challengers_Model);

		// Then
/*		response.then().statusCode(201);*/

		// to validate Response response
		// As of now we are not getting any response ,beacuse we dont have api so trying
		// with request model
		
		
		// we need to get response with get request 
		//response = client.getTeam("1234");


		Map<String, String> map = new HashMap<String, String>();
		royal_Challengers_Model.getPlayer();

		for (int i = 0; i < royal_Challengers_Model.getPlayer().size(); i++) {
			if (!royal_Challengers_Model.getPlayer().get(i).getcountry().contains("India")) {
				map.put(royal_Challengers_Model.getPlayer().get(i).getName(),
						royal_Challengers_Model.getPlayer().get(i).getcountry());
				System.out.println(royal_Challengers_Model.getPlayer().get(i).getName() +"player not belongs to india");
			} else {
				System.out.println(royal_Challengers_Model.getPlayer().get(i).getName()+"player  belongs to india");
			}
		}
		System.out.println("foreign player present are  " + map.size());

	}

}
