package weekopdracht_racing.Teamlid;

import java.time.Period;
import java.util.*;

import weekopdracht_racing.*;
import weekopdracht_racing.Team.Team;

public class Coureur extends Teamlid implements Trainbaar, Interviewbaar {
	Map<Racebaan, Period> records = new HashMap();
	int positie, punten, strafpunten;		//klassement
	Raceauto auto;
	List<Period> rondetijden = new ArrayList();
	
	public Coureur() {
		
	}
	public Coureur(String naam, String teamnaam) {
		super(naam, teamnaam);
	}
	
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
