package restAssuredAssignment.RestApi;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import team_Request_Model.RCB_Fixture;
import team_Request_Model.Royal_Challengers_Model;
import team_Request_Model.client;

public class Tc2 {

	RCB_Fixture rcbFixture;
	Royal_Challengers_Model royal_Challengers_Model;
	Response response;
	// RestAssured.baseURI = "";

	@Test
	public void verifyTeamHasOneWicketKeeper() {

		// Given
		RCB_Fixture fixture = new RCB_Fixture();
		royal_Challengers_Model = fixture.createChallengersRequest();

		// when
		 response=client.createTeam(royal_Challengers_Model);

		// Then
		/* response.then().statusCode(201);*/

		// to validate Response response
		// As of now we are not getting any response ,beacuse we dont have api so trying
		// with request model

		Map<String, String> map = new HashMap<String, String>();
		royal_Challengers_Model.getPlayer();

		for (int i = 0; i < royal_Challengers_Model.getPlayer().size(); i++) {
			if (royal_Challengers_Model.getPlayer().get(i).getrole().contains("Wicket-keeper")) {
				map.put(royal_Challengers_Model.getPlayer().get(i).getName() + "",
						royal_Challengers_Model.getPlayer().get(i).getrole());
				System.out.println(royal_Challengers_Model.getPlayer().get(i).getName()+" is wicket keeper");

			} else {
				System.out.println(royal_Challengers_Model.getPlayer().get(i).getName()+"player is not wicket keeper");
			}
		}
		System.out.println("Total Wicket-keeper " + map.size());
		
		Assert.assertEquals(map.size(), 1);

	}

}
