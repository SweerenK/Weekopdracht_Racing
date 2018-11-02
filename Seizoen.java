package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;

import weekopdracht_racing.Autoonderdeel.Motor;
import weekopdracht_racing.Team.*;
import weekopdracht_racing.Teamlid.*;

public class Seizoen {

	private Race[] races = new Race[10];
	private List<Team> teamlijst;
	private List<Teamlid> coureurlijst, teambaaslijst, monteurlijst, bandenjongenlijst;
	private List<Racebaan> racebaanlijst;
	private List<Raceauto> raceautolijst;

	

	


	public Seizoen() {
		setTeams(new TeamFactory().maakTeams());
		setCoureurs(new TeamlidFactory().maakCoureurs(teamlijst));
		System.out.println("-------------");
		setTeambazen(new TeamlidFactory().maakTeambazen(teamlijst));
		System.out.println("-------------");
		setMonteurs(new TeamlidFactory().maakTeammonteurs(coureurlijst));
		System.out.println("-------------");
		setBandenjongens(new TeamlidFactory().maakTeambandenjongens(coureurlijst));
		System.out.println("-------------");
		setRacebaanlijst(new RacebaanFactory().maakRacebaanlijst());
		bouwAlleRacebanen();
		setRaceautolijst(new RaceautoFactory().maakRaceautos(coureurlijst));
		
		
		
		Raceauto auto = new Raceauto();
		auto.setMotor(new Motor(300));
		//coureurlijst.get(1).
		
		
	}
	public List<Raceauto> getRaceautolijst() {
		return raceautolijst;
	}


	public void setRaceautolijst(List<Raceauto> raceautolijst) {
		this.raceautolijst = raceautolijst;
	}
	
	public void bouwAlleRacebanen() {
		for(int i = 0; i < racebaanlijst.size(); i++) {							//Bouw alle racebanen
			racebaanlijst.get(i).setBaandelen(new RacebaanFactory().maakRacebaan(i));
			races[i] = new Race();
			races[i].setBaan(racebaanlijst.get(i));
		}
		//System.out.println(races[0].getBaan().getAantalBochten() +" en "+ races[0].getBaan().getAantalRechteStukken());

	}
	
	public Race[] getRaces() {
		return races;
	}

	public void setRaces(Race[] races) {
		this.races = races;
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
	
	public List<Racebaan> getRacebaanlijst() {
		return racebaanlijst;
	}

	public void setRacebaanlijst(List<Racebaan> racebaanlijst) {
		this.racebaanlijst = racebaanlijst;
	}
}