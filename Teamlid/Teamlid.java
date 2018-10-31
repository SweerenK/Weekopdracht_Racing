package weekopdracht_racing.Teamlid;

public abstract class Teamlid {
	private String naam;
	int leeftijd, dageninDienst;
	double salarisPerRace;
	
	public Teamlid() {
		
	}
	public Teamlid(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
}
