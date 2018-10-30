package weekopdracht_racing.Team;

import java.time.LocalDate;
import java.util.ArrayList;
import weekopdracht_racing.Teamlid.*;
import weekopdracht_racing.*;

public abstract class Team {
	String naam;
	int positie, punten;	//in teamklassement
	double budget;
	LocalDate oprichtingsdatum;
	ArrayList<Raceauto> raceautos;
	ArrayList<Teamlid> teamleden;

	public Team() {
		
	}
	public Team(Enum naam) {
		this.naam = naam.toString();
	}
	
}