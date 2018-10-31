package weekopdracht_racing.Teamlid;

import java.util.ArrayList;
import java.util.List;

import weekopdracht_racing.Team.*;

public class TeamlidFactory {

	String[][] coureurnamen = { { "Lewis Hamilton", "leeftijd" }, { "Sebastian Vettel", "leeftijd" },
			{ "Kimi Raikkonen", "leeftijd" }, { "Valteri Bottas", "leeftijd" }, { "Max Verstappen", "leeftijd" },
			{ "Daniel Ricciardo", "leeftijd" }, { "Nico Hulkenberg", "leeftijd" }, { "Sergio Perez", "leeftijd" },
			{ "Kevin Magnussen", "leeftijd" }, { "Fernando Alonso", "leeftijd" }, { "Esteban Ocon", "leeftijd" },
			{ "Carlos Sainz", "leeftijd" }, { "Romain Grosjean", "leeftijd" }, { "Pierre Gasly", "leeftijd" },
			{ "Charles Leclerc", "leeftijd" }, { "Stoffel Vandoorne", "leeftijd" }, { "Marcus Ericsson", "leeftijd" },
			{ "Lance Stroll", "leeftijd" }, { "Brendon Hartley", "leeftijd" }, { "Sergey Sirotkin", "leeftijd" } };
	List<Teamlid> coureurlijst = new ArrayList<>();

	public List<Teamlid> maakCoureurs() {
		for (int i = 0; i < coureurnamen.length; i++) {
			String coureurnaam = coureurnamen[i][0];
			coureurlijst.add(new Coureur(coureurnaam));	
		}
		return coureurlijst;
	}

}
