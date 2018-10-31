package weekopdracht_racing.Teamlid;

import java.util.ArrayList;
import java.util.List;

import weekopdracht_racing.Seizoen;
import weekopdracht_racing.Team.*;

public class TeamlidFactory {

	String[][] coureurnamen = { { "Lewis Hamilton", "leeftijd", "Mercedes" },
			{ "Sebastian Vettel", "leeftijd", "Ferrari" }, { "Kimi Raikkonen", "leeftijd", "Ferrari" },
			{ "Valteri Bottas", "leeftijd", "Mercedes" }, { "Max Verstappen", "leeftijd", "Red Bull" },
			{ "Daniel Ricciardo", "leeftijd", "Red Bull" }, { "Nico Hulkenberg", "leeftijd", "Renault" },
			{ "Sergio Perez", "leeftijd", "Force India" }, { "Kevin Magnussen", "leeftijd", "Haas" },
			{ "Fernando Alonso", "leeftijd", "McLaren" }, { "Esteban Ocon", "leeftijd", "Force India" },
			{ "Carlos Sainz", "leeftijd", "Renault" }, { "Romain Grosjean", "leeftijd", "Haas" },
			{ "Pierre Gasly", "leeftijd", "Toro Rosso" }, { "Charles Leclerc", "leeftijd", "Sauber" },
			{ "Stoffel Vandoorne", "leeftijd", "McLaren" }, { "Marcus Ericsson", "leeftijd", "Sauber" },
			{ "Lance Stroll", "leeftijd", "Williams" }, { "Brendon Hartley", "leeftijd", "Toro Rosso" },
			{ "Sergey Sirotkin", "leeftijd", "Williams" } };
	List<Teamlid> coureurlijst = new ArrayList<>();

	public List<Teamlid> maakCoureurs(List<Team> teamlijst) {
		for (int i = 0; i < coureurnamen.length; i++) {
			String coureurnaam = coureurnamen[i][0];
			String teamnaam = coureurnamen[i][2];
			Coureur x = new Coureur(coureurnaam, teamnaam);
			coureurlijst.add(x);
			koppelenAanTeam(x, teamlijst);
		}
		return coureurlijst;
	}

	public void koppelenAanTeam(Coureur coureur, List<Team> teamlijst) {
		koppelen_coureurs: for (int x = 0; x < coureurnamen.length; x++) {
			if (coureurnamen[x][0].equals(coureur.getNaam())) {
				for (int y = 0; y < teamlijst.size(); y++) {
					if (coureurnamen[x][2].equals(teamlijst.get(y).getNaam())) {
						coureur.setTeam(teamlijst.get(y));
						System.out.println(coureur.getNaam() + "<>" + teamlijst.get(y).getNaam());
						break koppelen_coureurs;
					}
				}
			} else {
				continue koppelen_coureurs;
			}
		}
	}
}
