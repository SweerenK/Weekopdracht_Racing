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
	String[][] teambaasnamen = { { "Toto Wolff", "Mercedes" }, { "Maurizio Arrivabene", "Ferrari" },
			{ "Christian Horner", "Red Bull" }, { "Cyril Abiteboul", "Renault" }, { "Guenther Steiner", "Haas" },
			{ "Lawrence Stroll", "Force India" }, { "Zak Brown", "McLaren" }, { "Frederic Vasseur", "Sauber" },
			{ "Claire Williams", "Williams" }, { "Franz Tost", "Toro Rosso" } };

	List<Teamlid> coureurlijst = new ArrayList<Teamlid>();
	List<Teamlid> teambaaslijst = new ArrayList<Teamlid>();
	List<Teamlid> monteurlijst = new ArrayList<Teamlid>();

	public List<Teamlid> maakCoureurs(List<Team> teamlijst) {
		for (int i = 0; i < coureurnamen.length; i++) {
			String coureurnaam = coureurnamen[i][0];
			String teamnaam = coureurnamen[i][2];
			Coureur x = new Coureur(coureurnaam, teamnaam);
			coureurlijst.add(x);
			coureurKoppelenAanTeam(x, teamlijst);
		}
		return coureurlijst;
	}

	public List<Teamlid> maakTeammonteurs(List<Teamlid> coureurs) {
		for (int i = 0; i < coureurs.size(); i++) {
			for(int j = 0; j < 2; j++) {
				StringBuilder monteurnaam = new StringBuilder("Monteur ");
				monteurnaam.append(j+1);
				Teamlid x = new Monteur();
				x.setNaam(monteurnaam.toString());
				monteurlijst.add(x);
				x.setTeam(coureurs.get(i).getTeam());
				System.out.println(x.getNaam() + "<>" + x.getTeam().getNaam());
			}
		}
		return monteurlijst;
	}

	public List<Teamlid> maakTeambazen(List<Team> teamlijst) {
		for (int i = 0; i < teambaasnamen.length; i++) {
			String teambaasnaam = teambaasnamen[i][0];
			String teamnaam = teambaasnamen[i][1];
			Teambaas x = new Teambaas(teambaasnaam, teamnaam);
			teambaaslijst.add(x);
			teambaasKoppelenAanTeam(x, teamlijst);
		}
		return coureurlijst;
	}

	public void coureurKoppelenAanTeam(Teamlid lid, List<Team> teamlijst) {
		koppelen_coureurs: for (int x = 0; x < coureurnamen.length; x++) {
			if (coureurnamen[x][0].equals(lid.getNaam())) {
				for (int y = 0; y < teamlijst.size(); y++) {
					if (coureurnamen[x][2].equals(teamlijst.get(y).getNaam())) {
						lid.setTeam(teamlijst.get(y));
						System.out.println(lid.getNaam() + "<>" + teamlijst.get(y).getNaam());
						break koppelen_coureurs;
					}
				}
			} else {
				continue koppelen_coureurs;
			}
		}
	}
	
	public void teambaasKoppelenAanTeam(Teamlid lid, List<Team> teamlijst) {
		koppelen_teambazen: for (int x = 0; x < teambaasnamen.length; x++) {
			if (teambaasnamen[x][0].equals(lid.getNaam())) {
				for (int y = 0; y < teamlijst.size(); y++) {
					if (teambaasnamen[x][1].equals(teamlijst.get(y).getNaam())) {
						lid.setTeam(teamlijst.get(y));
						System.out.println(lid.getNaam() + "<>" + teamlijst.get(y).getNaam());
						break koppelen_teambazen;
					}
				}
			} else {
				continue koppelen_teambazen;
			}
		}
	}
	
	

}
