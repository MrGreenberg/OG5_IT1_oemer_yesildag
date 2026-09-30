
public class Schiedsrichter extends Mitglieder {

	
	private boolean ehrentamtlich;
	private int gepfiffeneSpiele;
	
	
	public boolean isEhrentamtlich() {
		return ehrentamtlich;
	}
	public void setEhrentamtlich(boolean ehrentamtlich) {
		this.ehrentamtlich = ehrentamtlich;
	}
	public int getGepfiffeneSpiele() {
		return gepfiffeneSpiele;
	}
	public void setGepfiffeneSpiele(int gepfiffeneSpiele) {
		this.gepfiffeneSpiele = gepfiffeneSpiele;
	}
	
	
	public Schiedsrichter(int gepfiffeneSpiele, boolean ehrenamtlich) {
		this.ehrentamtlich = ehrenamtlich;
		this.gepfiffeneSpiele = gepfiffeneSpiele;
	}
	
	
	
	
	
	
}
