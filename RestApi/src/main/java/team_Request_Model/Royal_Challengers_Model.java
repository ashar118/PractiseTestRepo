package team_Request_Model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Royal_Challengers_Model {

	private String name;
	private String location;
	private List<Player> player;
	
	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

/*	@Override
	private String toString() {
		ObjectMapper objectMapper = new ObjectMapper();
		String fasterXmlToString = null;
		try {
			fasterXmlToString = objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();

		}
		return fasterXmlToString;
	}*/

	public void addPlayer(Player player ) {
		if(this.player == null) {
	this.player = new ArrayList<Player>();
		}
		this.player.add(player);
		
	}

}
