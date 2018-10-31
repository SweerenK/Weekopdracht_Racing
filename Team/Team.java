package weekopdracht_racing.Team;

import java.time.LocalDate;
import java.util.ArrayList;
import weekopdracht_racing.Teamlid.*;
import weekopdracht_racing.*;

public abstract class Team {
	private String naam;
	int positie, punten;	//in teamklassement
	double budget;
	LocalDate oprichtingsdatum;
	ArrayList<Raceauto> raceautos;
	ArrayList<Teamlid> teamleden;

	public Team() {
		
	}
	public Team(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	
}