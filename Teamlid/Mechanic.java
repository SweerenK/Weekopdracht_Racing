package weekopdracht_racing.Teamlid;

import weekopdracht_racing.Raceauto;
import weekopdracht_racing.Autoonderdeel.Motor;

public class Mechanic extends Teamlid {
	public Mechanic() {

	}

	public Mechanic(String naam, String teamnaam) {
		super(naam, teamnaam);
	}

	int precisie, snelheid;

	public Raceauto repareren(Raceauto auto) {
		// repareer de auto in geval van schade
		return auto;
	}

	public Motor repareren(Motor motor) {
		// repareer de motor in geval van schade
		return motor;
	}
}
