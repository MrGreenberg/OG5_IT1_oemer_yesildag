import java.util.ArrayList;
import java.util.List;

public class Kunde {

    private String zahlungsArt;
    private List<Bestellung> bestellungen;

    public Kunde() {
        bestellungen = new ArrayList<>();
    }

    public String getZahlungsart() {
        return zahlungsArt;
    }

    public void setZahlungsart(String zahlungsArt) {
        this.zahlungsArt = zahlungsArt;
    }

    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }

    public void addBestellung(Bestellung bestellung) {
        bestellungen.add(bestellung);
        bestellung.setKunde(this);
    }
}
