package weekopdracht_racing;

import weekopdracht_racing.Autoonderdeel.Raceband;

public class Bandenmaker implements Interviewbaar{

	public String antwoordGevenOpVragen() {
		return "";
	}
	
	public Raceband maakBand() {
		//instellen constructor geeft bepaalde settings mee?
		return new Raceband();
	}
}
