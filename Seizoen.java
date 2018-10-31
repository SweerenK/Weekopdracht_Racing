package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;
import weekopdracht_racing.Team.*;
import weekopdracht_racing.Teamlid.*;

public class Seizoen {
	
	Race[] races;
	private List<Team> teams;
	private List<Teamlid> coureurs;
	
	public Seizoen() {
		setTeams(new TeamFactory().maakTeams());
		setCoureurs(new TeamlidFactory().maakCoureurs(teams));
	}
	
	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Teamlid> getCoureurs() {
		return coureurs;
	}

	public void setCoureurs(List<Teamlid> coureurs) {
		this.coureurs = coureurs;
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
