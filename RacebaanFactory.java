package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import weekopdracht_racing.Baandeel.Baandeel;
import weekopdracht_racing.Baandeel.Bocht;
import weekopdracht_racing.Baandeel.Rechtstuk;
import weekopdracht_racing.Team.Fabrieksteam;
import weekopdracht_racing.Team.Klantenteam;
import weekopdracht_racing.Team.Team;
import weekopdracht_racing.Teamlid.Monteur;
import weekopdracht_racing.Teamlid.Teamlid;

public class RacebaanFactory {
	String[][] racebanen = { { "Mexican Grand Prix", "18", "17", "4304", "71" },
			{ "Testbaan", "4", "4", "1200", "50" } };
	List<Racebaan> racebaanlijst = new ArrayList<Racebaan>();
	Random random = new Random();

	public List<Racebaan> maakRacebaanlijst() {
		for (int i = 0; i < racebanen.length; i++) {
			String racebaannaam = racebanen[i][0];
			Racebaan z = new Racebaan();
			z.setNaam(racebaannaam.toString());
			racebaanlijst.add(z);
			//System.out.println(z.getNaam() + "<banen");
			z.setLengte(Integer.parseInt(racebanen[i][3]));
			z.setAantalBochten(Integer.parseInt(racebanen[i][2]));
			z.setAantalRechteStukken(Integer.parseInt(racebanen[i][1]));
		}
		return racebaanlijst;
	}
	
	public Baandeel[] maakRacebaan(int baankeuze) {
		int totaleBaanlengte = Integer.parseInt(racebanen[baankeuze][3]);
		int aantalBochten = Integer.parseInt(racebanen[baankeuze][2]);
		int aantalRechteStukken = Integer.parseInt(racebanen[baankeuze][1]);
		int enkeleBochtLengte = 25*totaleBaanlengte / (100* aantalBochten);
		int enkeleRechteStukLengte = (totaleBaanlengte - (aantalBochten*enkeleBochtLengte))/aantalRechteStukken;
		
		Baandeel[] baandelen = new Baandeel[aantalBochten+aantalRechteStukken];
		
		for(int i = 0; i < aantalBochten; i++) {
			Baandeel x = new Bocht(enkeleBochtLengte);
			x.setBaandeelPositie(2*i+1);
			baandelen[i] = x;
		}
		for(int j = 0; j < aantalRechteStukken; j++) {
			Baandeel y = new Rechtstuk(enkeleRechteStukLengte);
			y.setBaandeelPositie(2*(j+1));
			baandelen[j] = y;
		}
		
		return baandelen;
	}
}
