
public class Mannschaftsleiter extends Mitglieder {

	private String zusatzAfugabe;
	private String mannschaftsName;
	private boolean rabatt;
	
	
	
	public String getZusatzAfugabe() {
		return zusatzAfugabe;
	}
	public void setZusatzAfugabe(String zusatzAfugabe) {
		this.zusatzAfugabe = zusatzAfugabe;
	}
	public String getMannschaftsName() {
		return mannschaftsName;
	}
	public void setMannschaftsName(String mannschaftsName) {
		this.mannschaftsName = mannschaftsName;
	}
	public boolean isRabatt() {
		return rabatt;
	}
	public void setRabatt(boolean rabatt) {
		this.rabatt = rabatt;
	}
	
	
	public Mannschaftsleiter(String zusatzAufgabe, String mannschaftsName, boolean rabatt) {
		this.mannschaftsName = mannschaftsName;
		this.rabatt = rabatt;
		this.zusatzAfugabe = zusatzAufgabe;
	}
	
	
	
	
	
	
	
}
