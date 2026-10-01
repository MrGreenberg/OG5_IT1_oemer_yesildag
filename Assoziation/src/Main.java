public class Main {

    public static void main(String[] args) {

        Kunde kunde = new Kunde();
        kunde.setZahlungsart("PayPal");

        Bestellung bestellung1 = new Bestellung();
        bestellung1.setPreis(49.99);
        bestellung1.setArt("Elektronik");

        Bestellung bestellung2 = new Bestellung();
        bestellung2.setPreis(19.99);
        bestellung2.setArt("Buch");

        kunde.addBestellung(bestellung1);
        kunde.addBestellung(bestellung2);
    }
}
