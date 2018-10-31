package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;
import weekopdracht_racing.Team.*;
import weekopdracht_racing.Teamlid.*;

public class Seizoen {

	Race[] races;
	private List<Team> teamlijst;
	private List<Teamlid> coureurlijst, teambaaslijst, monteurlijst, bandenjongenlijst;

	public Seizoen() {
		setTeams(new TeamFactory().maakTeams());
		setCoureurs(new TeamlidFactory().maakCoureurs(teamlijst));
		System.out.println("-------------");
		setTeambazen(new TeamlidFactory().maakTeambazen(teamlijst));
		System.out.println("-------------");
		setMonteurs(new TeamlidFactory().maakTeammonteurs(coureurlijst));
		System.out.println("-------------");
		setBandenjongens(new TeamlidFactory().maakTeambandenjongens(coureurlijst));
	}

	public List<Team> getTeams() {
		return teamlijst;
	}

	public void setTeams(List<Team> teams) {
		this.teamlijst = teams;
	}

	public List<Teamlid> getCoureurs() {
		return coureurlijst;
	}

	public void setCoureurs(List<Teamlid> coureurs) {
		this.coureurlijst = coureurs;
	}

	public List<Teamlid> getMonteurs() {
		return monteurlijst;
	}

	public void setMonteurs(List<Teamlid> monteurs) {
		this.monteurlijst = monteurs;
	}

	public List<Teamlid> getTeambazen() {
		return teambaaslijst;
	}

	public void setTeambazen(List<Teamlid> teambazen) {
		this.teambaaslijst = teambazen;
	}

	public String toonAlleTeams() {
		StringBuilder alleTeamNamen = new StringBuilder();
		for (Team x : teamlijst) {
			alleTeamNamen.append(x.getNaam() + ", ");
		}
		return alleTeamNamen.toString();
	}

	public String toonAlleCoureurs() {
		StringBuilder alleCoureurNamen = new StringBuilder();
		for (Teamlid x : coureurlijst) {
			alleCoureurNamen.append(x.getNaam() + ", ");
		}
		return alleCoureurNamen.toString();
	}

	public String toonAlleTeambazen() {
		StringBuilder alleTeambaasNamen = new StringBuilder();
		for (Teamlid x : teambaaslijst) {
			alleTeambaasNamen.append(x.getNaam() + ", ");
		}
		return alleTeambaasNamen.toString();
	}

	public List<Teamlid> getBandenjongens() {
		return bandenjongenlijst;
	}

	public void setBandenjongens(List<Teamlid> bandenjongenlijst) {
		this.bandenjongenlijst = bandenjongenlijst;
	}
}