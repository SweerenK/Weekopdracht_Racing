package weekopdracht_racing.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamFactory {
	String[][] teamnamen = { { "Mercedes", "Ferrari", "Red Bull", "Renault" },
			{ "Haas", "McLaren", "Force India", "Sauber", "Toro Rosso", "Williams" } };
	private List<Team> teamlijst = new ArrayList<>();

	public List<Team> getTeamlijst() {
		return teamlijst;
	}

	public void setTeamlijst(List<Team> teamlijst) {
		this.teamlijst = teamlijst;
	}

	public List<Team> maakTeams() {
		for (int i = 0; i < teamnamen.length; i++) {
			for (int j = 0; j < teamnamen[i].length; j++) {
				String teamnaam = teamnamen[i][j];
				if (i == 0) {
					teamlijst.add(new Fabrieksteam(teamnaam));
				} else {
					teamlijst.add(new Klantenteam(teamnaam));
				}
			}
		}
		return teamlijst;
	}
}
