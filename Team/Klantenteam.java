package weekopdracht_racing.Team;

import weekopdracht_racing.Autoonderdeel.Motor;

public class Klantenteam extends Team{
	Fabrieksteam leverancier;
	
	public Klantenteam(){
		
	}
	public Klantenteam(String naam) {
		super(naam);
	}
	
	public void betaalVoorMotor(Fabrieksteam fabrieksteam, Motor motor){
		
	}
	public void vraagOmUpdates(Fabrieksteam fabrieksteam) {
		//roep teambaas aan van Fabrieksteam
	}
	
}
