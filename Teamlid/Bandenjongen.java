package weekopdracht_racing.Teamlid;

import weekopdracht_racing.*;
import weekopdracht_racing.Autoonderdeel.Raceband;

public class Bandenjongen extends Mechanic implements Trainbaar{
	//Komt in actie wanneer de teambaas dit eist.
	
	int precisie, snelheid;
	
	public boolean Bandenwissel(Raceauto auto, Raceband band) {
		//als foutje of geen banden: return false. Anders:
		//voeg nieuwe bandenset-object toe aan raceauto-object
		return true;
	}
	
	public int verbeteren() {
		//Op basis van ervaring, leeftijd (en evt (random) XP-points) verbeteren.
		return 0;
	}
}
