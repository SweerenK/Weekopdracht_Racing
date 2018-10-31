package weekopdracht_racing.Teamlid;

import weekopdracht_racing.Team.*;

public abstract class Teamlid {
	private String naam;
	int leeftijd, dageninDienst;
	double salarisPerRace;
	private Team team;

	public Teamlid() {

	}

	public Teamlid(String naam, String teamnaam) {
		this.naam = naam;
			
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}
