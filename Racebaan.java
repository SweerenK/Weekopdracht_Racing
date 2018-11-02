package weekopdracht_racing;

import java.time.Period;
import weekopdracht_racing.Baandeel.Baandeel;
import weekopdracht_racing.Teamlid.Coureur;

public class Racebaan {
	private String naam;
	
	Period baanrecord;
	Coureur houderBaanrecord;
	private Baandeel[] baandelen;
	private int toeschouwersCapaciteit, aantalBochten, aantalRechteStukken;
	private int lengte;
	
	public int getAantalBochten() {
		return aantalBochten;
	}
	public void setAantalBochten(int aantalBochten) {
		this.aantalBochten = aantalBochten;
	}
	public int getAantalRechteStukken() {
		return aantalRechteStukken;
	}
	public void setAantalRechteStukken(int aantalRechteStukken) {
		this.aantalRechteStukken = aantalRechteStukken;
	}
	
	public int getLengte() {
		return lengte;
	}
	public void setLengte(int lengte) {
		this.lengte = lengte;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Baandeel[] getBaandelen() {
		return baandelen;
	}
	public void setBaandelen(Baandeel[] baandelen) {
		this.baandelen = baandelen;
	}
	
	public String toonBaanInfo() {
		return "Een bocht is " + baandelen[0].getLengte();
	}
}
