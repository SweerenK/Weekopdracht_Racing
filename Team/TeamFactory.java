package weekopdracht_racing.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamFactory {
	List<Team> teamlijst = new ArrayList<>();
	
	public List<Team> maakTeams() {	
		for (int i = 0; i < Team_enum.values().length; i++) {
			Enum team = Team_enum.values()[i];
			if(i<4) {
				teamlijst.add(new Fabrieksteam(team));
			}else {
				teamlijst.add(new Klantenteam(team));	
			}
		}
		return teamlijst;
	}
	
	@Override
	public String toString() {
		String teamnamen = teamlijst.stream().map(Object::toString).collect(Collectors.joining(", "));
		return teamnamen;
	}
}
