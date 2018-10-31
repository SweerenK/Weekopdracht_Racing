package weekopdracht_racing;

import java.util.List;
import weekopdracht_racing.Team.*;

public class Seizoen {
	Race[] races;
	List<Team> teams;

	public Seizoen() {
		teams = new TeamFactory().maakTeams();
	}
	
	public String toonAlleTeams() {
		StringBuilder alleTeamNamen = new StringBuilder();
		for(Team x: teams) {
			alleTeamNamen.append(x.getNaam() + ", ");
		}
		return alleTeamNamen.toString();
	}
	
	
	
	
	//public Seizoen(List<Team>) {
		
	//}
	
		// Geef elk team: 2 coureurs, 1 teambaas, 1 bandenjongen, 1 monteur en 1

}
