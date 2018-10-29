package weekopdracht_racing.Teamlid;

import java.time.Period;
import java.util.*;

import weekopdracht_racing.*;

public class Coureur extends Teamlid implements Trainbaar, Interviewbaar {
	Map<Racebaan, Period> records = new HashMap();
	int positie, punten, strafpunten;		//klassement
	Raceauto auto;
	List<Period> rondetijden = new ArrayList();
	
	public void racen(){
		
	}
	public String antwoordGevenOpVragen() {
		return "";
	}
	
	public int verbeteren() {
		//Op basis van ervaring, klassering, leeftijd (en evt (random) XP-points) verbeteren.
		return 0;
	}
}
