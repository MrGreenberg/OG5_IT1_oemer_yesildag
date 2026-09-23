package omnom;

public class Haustier {

	private int hunger = 100;
	private int muede = 100;
	private int zufrieden = 100;
	private int gesund = 100;
	private String name;

	public Haustier() {

	}

	public Haustier(String name) {
		this.name = name;
	}

	public int getHunger() {
		return this.hunger;
	}

	public void setHunger(int hunger) {
		if (hunger <= 100 && hunger >= 0) {
			this.hunger = hunger;
		}
	}

	public int getMuede() {
		return this.muede;
	}

	public void setMuede(int muede) {
		if (muede <= 100 && muede >= 0) {
			this.muede = muede;
		}
	}

	public int getZufrieden() {
		return this.zufrieden;
	}

	public void setZufrieden(int zufrieden) {
		if (zufrieden <= 100 && zufrieden >= 0) {
			this.zufrieden = zufrieden;
		}
	}

	public int getGesund() {
		return this.gesund;
	}

	public void setGesund(int gesund) {
		if (gesund <= 100 && gesund >= 0) {
			this.gesund = gesund;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void heilen() {
		setGesund(100);
	}

	public void schlafen(int dauer) {
		setMuede(dauer + this.muede);
	}

	public void spielen(int dauer) {
		setZufrieden(dauer + this.zufrieden);
	}

	public void fuettern(int anzahl) {
		setHunger(anzahl + this.hunger);
	}

}
