package aufgabe;


public class Testklasse {

    public static void starten() {

        for (int n = 15000000; n <= 20000000; n += 1000000) {

            System.out.println("Listenlaenge: " + n);

            long[] zahlen = SortedListGenerator.getSortedList(n);

            testen(zahlen, zahlen[0], "Linear Best-Case", true);
            testen(zahlen, zahlen[n / 2], "Linear Average-Case", true);
            testen(zahlen, zahlen[n - 1], "Linear Worst-Case", true);
            testen(zahlen, zahlen[n - 1] + 1, "Linear Nicht vorhanden", true);

            testen(zahlen, zahlen[n / 2], "Binaer Best-Case", false);
            testen(zahlen, zahlen[n / 3], "Binaer Average-Case", false);
            testen(zahlen, zahlen[n - 1], "Binaer Worst-Case", false);
            testen(zahlen, zahlen[n - 1] + 1, "Binaer Nicht vorhanden", false);

            System.out.println("--------------------------------");
        }
    }

    public static void testen(long[] zahlen, long gesucht, String name, boolean linear) {

        double gesamtzeit = 0;

        for (int i = 0; i < 3; i++) {

            Stoppuhr uhr = new Stoppuhr();

            uhr.starten();

            if (linear) {
                Suchalgorithmus.lineareSuche(zahlen, gesucht);
            } else {
                Suchalgorithmus.binaereSuche(zahlen, gesucht);
            }

            gesamtzeit += uhr.stoppen();
        }

        double durchschnitt = gesamtzeit / 3;

        System.out.println(name + ": " + durchschnitt + " ms");
    }
}
