public class Suchversuch {

    // Speichert das Suchergebnis
    static volatile int kontrollwert;


    // --------------------------------
    // LINEARE SUCHE
    // --------------------------------

    public static int lineareSuche(long[] array, long gesucht) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }


    // --------------------------------
    // BINAERE SUCHE
    // --------------------------------

    public static int binaereSuche(long[] array, long gesucht) {

        int links = 0;
        int rechts = array.length - 1;

        while (links <= rechts) {

            int mitte = (links + rechts) / 2;

            if (array[mitte] == gesucht) {
                return mitte;
            }

            if (array[mitte] < gesucht) {
                links = mitte + 1;
            } else {
                rechts = mitte - 1;
            }
        }

        return -1;
    }


    // --------------------------------
    // SUCHSCHRITTE DER BINAEREN SUCHE
    // --------------------------------

    public static int suchschritte(int index, int n) {

        int links = 0;
        int rechts = n - 1;
        int schritte = 0;

        while (links <= rechts) {

            int mitte = (links + rechts) / 2;
            schritte++;

            if (mitte == index) {
                return schritte;
            }

            if (mitte < index) {
                links = mitte + 1;
            } else {
                rechts = mitte - 1;
            }
        }

        return schritte;
    }


    // --------------------------------
    // BINAERE TESTPOSITIONEN BESTIMMEN
    // --------------------------------

    public static int[] findeBinaerePositionen(int n) {

        int worstIndex = 0;
        int maxSchritte = 0;

        long gesamtSchritte = 0;

        for (int i = 0; i < n; i++) {

            int schritte = suchschritte(i, n);

            gesamtSchritte += schritte;

            if (schritte > maxSchritte) {

                maxSchritte = schritte;
                worstIndex = i;

            }
        }

        double durchschnitt =
            gesamtSchritte / (double) n;

        int averageIndex = 0;
        double kleinsterAbstand = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int schritte = suchschritte(i, n);

            double abstand =
                Math.abs(schritte - durchschnitt);

            if (abstand < kleinsterAbstand) {

                kleinsterAbstand = abstand;
                averageIndex = i;

            }
        }

        return new int[] {
            (n - 1) / 2,
            averageIndex,
            worstIndex
        };
    }


    // --------------------------------
    // ZEITMESSUNG
    // --------------------------------

    public static long messen(
            long[] array,
            long gesucht,
            boolean binaer) {

        Stoppuhr uhr = new Stoppuhr();

        uhr.start();

        if (binaer) {

            kontrollwert = binaereSuche(array, gesucht);

        } else {

            kontrollwert = lineareSuche(array, gesucht);

        }

        uhr.stopp();

        return uhr.getMillis();
    }


    // --------------------------------
    // HAUPTPROGRAMM
    // --------------------------------

    public static void main(String[] args) {

        int[] groessen = {
            15000000,
            16000000,
            17000000,
            18000000,
            19000000,
            20000000
        };

        int wiederholungen = 7;

        for (int n : groessen) {

            System.out.println();
            System.out.println("==========================");
            System.out.println("Arraygroesse: " + n);
            System.out.println("==========================");

            // Array erstellen
            long[] zahlen =
                SortedListGenerator.getSortedList(n);


            // Lineare Suchfaelle
            long linearBest = zahlen[0];
            long linearAverage = zahlen[n / 2];
            long linearWorst = zahlen[n - 1];


            // Binaere Suchfaelle
            int[] positionen = findeBinaerePositionen(n);

            long binaerBest = zahlen[positionen[0]];
            long binaerAverage = zahlen[positionen[1]];
            long binaerWorst = zahlen[positionen[2]];


            // Zahl ist nicht vorhanden
            long nichtVorhanden = zahlen[n - 1] + 1;


            // Gesuchte Zahlen
            long[] suchzahlen = {

                linearBest,
                linearAverage,
                linearWorst,

                binaerBest,
                binaerAverage,
                binaerWorst,

                nichtVorhanden,
                nichtVorhanden

            };


            // Namen der Testfaelle
            String[] namen = {

                "Linear Best-Case",
                "Linear Average-Case",
                "Linear Worst-Case",

                "Binaer Best-Case",
                "Binaer Average-Case",
                "Binaer Worst-Case",

                "Linear nicht vorhanden",
                "Binaer nicht vorhanden"

            };


            // Suchalgorithmus festlegen
            boolean[] binaer = {

                false,
                false,
                false,

                true,
                true,
                true,

                false,
                true

            };


            // Algorithmen aufwaermen
            for (int i = 0; i < 5; i++) {

                lineareSuche(zahlen, linearAverage);
                binaereSuche(zahlen, binaerAverage);

            }


            // Alle Testfaelle messen
            for (int i = 0; i < suchzahlen.length; i++) {

                long gesamtzeit = 0;

                for (int j = 0; j < wiederholungen; j++) {

                    gesamtzeit += messen(
                        zahlen,
                        suchzahlen[i],
                        binaer[i]
                    );

                }

                // Durchschnitt berechnen
                long durchschnitt =
                    Math.round(gesamtzeit / (double) wiederholungen);

                // Sekunden und Millisekunden berechnen
                long sekunden = durchschnitt / 1000;
                long millisekunden = durchschnitt % 1000;

                // Ergebnis ausgeben
                System.out.println(
                    namen[i] + ": "
                    + sekunden + " Sekunden und "
                    + millisekunden + " Millisekunden"
                );

            }

            // Array freigeben
            zahlen = null;

        }

        System.out.println();
        System.out.println("Alle Versuche abgeschlossen!");

    }

}
