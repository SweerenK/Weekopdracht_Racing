package weekopdracht_racing;

import java.util.List;
import weekopdracht_racing.Team.*;
import weekopdracht_racing.Teamlid.*;

public class Seizoen {
	Race[] races;
	List<Team> teams;
	List<Teamlid> coureurs;
	
	public Seizoen() {
		teams = new TeamFactory().maakTeams();
		coureurs = new TeamlidFactory().maakCoureurs();
	}
	
	public String toonAlleTeams() {
		StringBuilder alleTeamNamen = new StringBuilder();
		for(Team x: teams) {
			alleTeamNamen.append(x.getNaam() + ", ");
		}
		return alleTeamNamen.toString();
	}
	
	public String toonAlleCoureurs() {
		StringBuilder alleCoureurNamen = new StringBuilder();
		for(Teamlid x: coureurs) {
			alleCoureurNamen.append(x.getNaam() + ", ");
		}
		return alleCoureurNamen.toString();
	}
	
	
	
	
	//public Seizoen(List<Team>) {
		
	//}
	
		// Geef elk team: 2 coureurs, 1 teambaas, 1 bandenjongen, 1 monteur en 1

}
