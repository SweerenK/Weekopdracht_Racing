package weekopdracht_racing.Baandeel;

import java.time.Duration;
import weekopdracht_racing.Raceauto;

public class Bocht extends Baandeel{
	int vertraging;			//random bepaald: 	Scherpe bocht: 0,25-0,35 x normale snelheid. 					15% van baan
							//					stompe bocht: 0,60 - 0,70 x normale snelheid.					10% van baan
	
	public Bocht() {
	}
	
	public Bocht(int lengte){				//125
		this.setLengte(lengte);
		
	}
	
	public Duration gaDoorBocht(Raceauto auto) {
		//random.nextInt(bound)
		
		return null;
	}
		
		
		//rechte stukken:		25% schade auto, 65% motor, 10% random 
		//bochten:				20% schade auto, 30% motor, 50% grip auto
	
	
}
