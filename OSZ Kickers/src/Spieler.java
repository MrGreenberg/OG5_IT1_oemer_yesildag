
public class Spieler extends Mitglieder {

	
	private int trikotnummer;
	private String spielposition;
	
	
	public int getTrikotnummer() {
		return trikotnummer;
	}
	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}
	public String getSpielposition() {
		return spielposition;
	}
	public void setSpielposition(String spielposition) {
		this.spielposition = spielposition;
	}
	
	
	public Spieler (String spielposition, int trikotnummer) {
		this.spielposition = spielposition;
		this.trikotnummer = trikotnummer;
	}
	
	
	
	
	
	
	
}
