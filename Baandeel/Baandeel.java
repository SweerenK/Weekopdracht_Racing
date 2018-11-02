package weekopdracht_racing.Baandeel;

import java.util.Random;

public abstract class Baandeel {
	Random random = new Random();
	private int baandeelPositie;
	private int lengte;
	
	
	public int getBaandeelPositie() {
		return baandeelPositie;
	}
	public void setBaandeelPositie(int baandeelPositie) {
		this.baandeelPositie = baandeelPositie;
	}
	public int getLengte() {
		return lengte;
	}
	public void setLengte(int lengte) {
		this.lengte = lengte;
	}
	
	
}
