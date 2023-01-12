package team_Request_Model;


public class RCB_Fixture  {
	
	Royal_Challengers_Model royal_Challengers_Model ;
	Player player;
	
	public Royal_Challengers_Model createChallengersRequest() {
		
		royal_Challengers_Model=royal_Challengers_Model.builder().build();
		royal_Challengers_Model.setName("royal_Challengers_Model");
		royal_Challengers_Model.setLocation("royal_Challengers_Model");
		
		
		
		player=player.builder().name("Faf Du Plessis")
				.country("South Africa")
				.role("Batsman")
				.price_in_crores("7").build();
		royal_Challengers_Model.addPlayer(player);
		
		player.builder()
				.name("Virat Kohli")
				.country("India")
				.role("Batsman")
				.price_in_crores("15").build();
		royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Glenn Maxwell")
				.country("Australia")
				.role("Batsman")
				.price_in_crores("11").build();
		royal_Challengers_Model.addPlayer(player);

		
		
		
		player=player.builder()
				.name("Mohammad Siraj")
				.country("India")
				.role("Bowler")
				.price_in_crores("7").build();
						royal_Challengers_Model.addPlayer(player);
						
						player=player.builder()
								.name("Harshal Patel")
								.country("India")
								.role("Bowler")
								.price_in_crores("10.75").build();
										royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Wanindu Hasaranga")
				.country("Srilanka")
				.role("Bowler")
				.price_in_crores("10.75").build();
						royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Dinesh Karthik")
				.country("India")
				.role("Wicket-keeper")
				.price_in_crores("5.5").build();
						royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Shahbaz Ahmed")
				.country("India")
				.role("All-Rounder")
				.price_in_crores("2.4").build();
						royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Rajat Patidar")
				.country("India")
				.role("Batsman")
				.price_in_crores("0.20").build();
						royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Josh Hazlewood")
				.country("Australia")
				.role("Bowler")
				.price_in_crores("7.75").build();
						royal_Challengers_Model.addPlayer(player);
		
		player=player.builder()
				.name("Mahipal Lomror")
				.country("India")
				.role("Bowler")
				.price_in_crores("7.75").build();
		royal_Challengers_Model.addPlayer(player);
		
		
		
		return royal_Challengers_Model;
		
	}
}
