package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;
import weekopdracht_racing.Team.*;

public class Seizoen {
	Race[] races;
	List<Team> teams;

	public Seizoen() {
		teams = new TeamFactory().maakTeams();
	}
	
	//public Seizoen(List<Team>) {
		
	//}
	
		// Geef elk team: 2 coureurs, 1 teambaas, 1 bandenjongen, 1 monteur en 1

}
