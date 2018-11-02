package weekopdracht_racing;

import weekopdracht_racing.Autoonderdeel.Motor;
import weekopdracht_racing.Autoonderdeel.Raceband;
import weekopdracht_racing.Teamlid.Coureur;

public class Raceauto {
	private Motor motor;
	
	Coureur coureur;
	Raceband raceband;
	private String naam;
	
	int beschadigd = 0;
	private int topsnelheid;
	
	public int getTopsnelheid() {
		return topsnelheid;
	}
	public void setTopsnelheid(int topsnelheid) {
		this.topsnelheid = topsnelheid;
	}
	public void versnellen(Racebaan baan) {
		
	}
	public void vertragen(Racebaan baan) {
		
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}
