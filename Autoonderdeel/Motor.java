package weekopdracht_racing.Autoonderdeel;

public class Motor extends Autoonderdeel{
	private String naam;
	int aantalPK;
	double kostenPerRace;
	int snelheid;
	
	public Motor(int snelheid) {
		this.snelheid = snelheid;
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}
