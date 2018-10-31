package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;
import weekopdracht_racing.Team.*;
import weekopdracht_racing.Teamlid.*;

public class Seizoen {
	
	Race[] races;
	private List<Team> teams;
	private List<Teamlid> coureurs, teambazen, monteurs;
	
	public Seizoen() {
		setTeams(new TeamFactory().maakTeams());
		setCoureurs(new TeamlidFactory().maakCoureurs(teams));
		System.out.println("-------------");
		setTeambazen(new TeamlidFactory().maakTeambazen(teams));
		System.out.println("-------------");
		setMonteurs(new TeamlidFactory().maakTeammonteurs(coureurs));
		
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
	public List<Teamlid> getMonteurs() {
		return monteurs;
	}

	public void setMonteurs(List<Teamlid> monteurs) {
		this.monteurs = monteurs;
	}

	
	public List<Teamlid> getTeambazen() {
		return teambazen;
	}

	public void setTeambazen(List<Teamlid> teambazen) {
		this.teambazen = teambazen;
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
	
	public String toonAlleTeambazen() {
		StringBuilder alleTeambaasNamen = new StringBuilder();
		for(Teamlid x: teambazen) {
			alleTeambaasNamen.append(x.getNaam() + ", ");
		}
		return alleTeambaasNamen.toString();
	}
	
	
	
	
	//public Seizoen(List<Team>) {
		
	//}
	
		// Geef elk team: 2 coureurs, 1 teambaas, 1 bandenjongen, 1 monteur en 1

}
