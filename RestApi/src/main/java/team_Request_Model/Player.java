package team_Request_Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Player {
	
	private String name;
	private String country;
	private String role;
	private String price_in_crores;
	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	
	public void setcountry(String country) {
		this.country = country;
	}

	
	public String getcountry() {
		return country;
	}
	
	public void setrole(String role) {
		this.role = role;
	}

	
	public String getrole() {
		return role;
	}
	
	public void setprice_in_crores(String price_in_crores) {
		this.price_in_crores = price_in_crores;
	}

	
	public String getprice_in_crores() {
		return price_in_crores;
	}

}
