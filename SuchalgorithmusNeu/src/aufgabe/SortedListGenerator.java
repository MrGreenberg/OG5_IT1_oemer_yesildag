package aufgabe;

import java.util.Random;

public class SortedListGenerator {

    public static long[] getSortedList(int laenge) {
        Random rand = new Random(111111);
        long[] zahlenliste = new long[laenge];
        long naechsteZahl = 0;

        for (int i = 0; i < laenge; i++) {
            naechsteZahl += rand.nextInt(3) + 1;
            zahlenliste[i] = naechsteZahl;
        }

        return zahlenliste;
    }
}

