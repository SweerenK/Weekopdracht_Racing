package weekopdracht_racing;

import java.util.InputMismatchException;

public class Menu {
	private String[] startMenuOpties = { "Begin nieuw seizoen", "Instellingen", "Afsluiten" };
	private String[] instellingsMenuOpties = {};

	public String[] getStartMenuOpties() {
		return startMenuOpties;
	}

	public void setStartMenuOpties(String[] startMenuOpties) {
		this.startMenuOpties = startMenuOpties;
	}

	public String[] getInstellingsMenuOpties() {
		return instellingsMenuOpties;
	}

	public void setInstellingsMenuOpties(String[] instellingsMenuOpties) {
		this.instellingsMenuOpties = instellingsMenuOpties;
	}
	
	public StringBuilder toonStartMenu() {
		StringBuilder menu = new StringBuilder("");
		for (int i = 0; i < startMenuOpties.length; i++) {
			menu.append((i + 1) + ".\t" + startMenuOpties[i] + "\n");
		}
		return menu;
	}

	
	
	public void menuRedirect(int menuKeuze) throws ArrayIndexOutOfBoundsException{
		switch (menuKeuze) {
		case 0:
			System.out.println("case 0");
			break;
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		default:
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
