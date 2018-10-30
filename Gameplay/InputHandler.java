package weekopdracht_racing.Gameplay;

import java.util.InputMismatchException;
import java.util.Scanner;

import weekopdracht_racing.Menu;

public class InputHandler {
	Scanner scan = new Scanner(System.in);

	public void spelInstructie() {
		System.out.printf("De volgende tekens en toetsen worden gebruikt:%n'>>>'\tDruk op 'enter' om door te gaan.%n%n");
	}
	
	public boolean pressEnter() {
		System.out.println("\t>>>");
		String input = scan.nextLine();
		if (input.length() != 0) {
			pressEnter();
			return false;
		}
		return true;
	}
	
	public int maakIntKeuze() throws InputMismatchException{
		try{
			System.out.println("\t Maak je keuze:");
			int input = scan.nextInt();
			return input;
		}catch(InputMismatchException imme) {
			throw new InputMismatchException();
		}
	}
	
	public void checkMenuKeuze(Menu menu) {
		while_menukeuze: while (true) {
			try {
				menu.menuRedirect(maakIntKeuze());
				break while_menukeuze;
			} catch (InputMismatchException imme) {
				scan.next();
				System.out.println("Onjuiste invoer, probeer opnieuw:");
				continue while_menukeuze;
			} catch (ArrayIndexOutOfBoundsException aioob) {
				System.out.println("Onjuiste invoer, probeer opnieuw:");
				continue while_menukeuze;
			}
		}
		
	}
	
	
	
	
}