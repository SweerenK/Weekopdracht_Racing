package weekopdracht_racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import weekopdracht_racing.Autoonderdeel.Motor;
import weekopdracht_racing.Team.Team;
import weekopdracht_racing.Teamlid.Coureur;
import weekopdracht_racing.Teamlid.Teamlid;

public class RaceautoFactory {
	String[][] raceautos = { {"Mercedes", "W09 EQ Power+", "334"},{"Ferrari", "SF71-H", "340"},{"Red Bull", "RB14", "326"}, {"Force India","VJM11","331"},{"Williams","FW41","333"},{"Renault","R.S.18","319"},{"Toro Rosso", "STR13", "331"},{"Haas","VF-18","333"},{"McLaren","MCL33","318"},{"Sauber","C37","325"}};
	List<Raceauto> raceautolijst = new ArrayList<Raceauto>();
	Random random = new Random();

	public List<Raceauto> maakRaceautos(List<Teamlid> coureurs) {

		for (int i = 0; i < coureurs.size(); i++) {
			Raceauto x = new Raceauto();
			raceautolijst.add(x);
			for(int j = 0; j < raceautos.length; j++) {
				x.setMotor(new Motor(Integer.parseInt(raceautos[j][2])));
				x.setNaam(raceautos[j][1]);
				
				if(coureurs.get(i).getTeam().getNaam().equals(raceautos[j][0])){
					coureurs.get(i).setAuto(x);
					System.out.println(x.getNaam() + "<autonaam coureur>" + coureurs.get(i).getNaam());	
				}
				
			}
		
		}
		return raceautolijst;
	}
}
