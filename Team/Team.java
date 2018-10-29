package weekopdracht_racing.Team;

import java.time.LocalDate;
import java.util.ArrayList;
import weekopdracht_racing.Teamlid.*;
import weekopdracht_racing.*;

public abstract class Team {
	String naam;
	ArrayList<Coureur> racers;
	Teambaas deBaas;
	int positie, punten;	//in teamklassement
	double budget;
	LocalDate oprichtingsdatum;
	ArrayList<Raceauto> raceautos;
	ArrayList<Teamlid> teamleden;
	
}
