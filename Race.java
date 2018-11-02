package weekopdracht_racing;

import weekopdracht_racing.Team.Team;
import weekopdracht_racing.Teamlid.Coureur;

public class Race {
	Team[] teams;
	Coureur[] coureurs;
	int aantalRondes;
	private Racebaan baan;
	public Racebaan getBaan() {
		return baan;
	}
	public void setBaan(Racebaan baan) {
		this.baan = baan;
	}
}
