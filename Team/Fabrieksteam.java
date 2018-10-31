package weekopdracht_racing.Team;

import java.util.ArrayList;
import weekopdracht_racing.Autoonderdeel.Motor;

public class Fabrieksteam extends Team{
	ArrayList<Klantenteam> afnemersMotor;
	
	public Fabrieksteam() {
		
	}
	public Fabrieksteam(String naam) {
		super(naam);
	}
	
	public Motor geefUpdates() {
		return new Motor();
	}
	
	public void ontwikkelUpdates(Motor motor) {
		//of return int en motor heeft als field ontwikkeltijdResterend?
	}
	

}
