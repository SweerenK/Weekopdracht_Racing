package weekopdracht_racing.Gameplay;

import java.util.InputMismatchException;

import weekopdracht_racing.*;
import weekopdracht_racing.Team.TeamFactory;
import weekopdracht_racing.Teamlid.*;

public class Main {

	public static void main(String[] args) {
		InputHandler inputhandler = new InputHandler();
		Menu menu = new Menu();
		inputhandler.spelInstructie();
		System.out.print(menu.toonStartMenu());
		inputhandler.checkMenuKeuze(menu);
		
		Seizoen seizoen = new Seizoen();
		//System.out.println(seizoen.toonAlleTeams());
		//System.out.println(seizoen.toonAlleCoureurs());
		System.out.println();
	}
}