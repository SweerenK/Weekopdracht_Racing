package weekopdracht_racing.Gameplay;

import java.util.InputMismatchException;

import weekopdracht_racing.Menu;
import weekopdracht_racing.Seizoen;
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
		
	}
}