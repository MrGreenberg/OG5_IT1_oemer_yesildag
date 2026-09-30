
public abstract class Mitglieder {

	private String name;
	private int telefonnummer;
	private boolean jahresbeitragBezahlt;
	

	public void Miglied(String name, int telefonnummer) {
		this.name = name;
		this.telefonnummer = telefonnummer;
		
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public boolean isJahresbeitragBezahlt() {
		return jahresbeitragBezahlt;
	}

	public void setJahresbeitragBezahlt(boolean jahresbeitragBezahlt) {
		this.jahresbeitragBezahlt = jahresbeitragBezahlt;
	}

	
	
	
	
	
	
	
	
	
}
