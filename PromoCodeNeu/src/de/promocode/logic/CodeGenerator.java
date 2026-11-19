
package de.promocode.logic;

import java.util.Arrays;
import java.util.Random;

public class CodeGenerator {

    public static long[] getSortedList(int laenge, long min, long max) {

        Random rand = new Random();
        long[] zahlenliste = new long[laenge];

        long naechsteZahl = min;

        for (int i = 0; i < laenge; i++) {

            naechsteZahl = min + (long) (
                    rand.nextDouble() * (max - min + 1)
            );

            zahlenliste[i] = naechsteZahl;
        }

        Arrays.sort(zahlenliste);

        System.out.println("Letzte Zahl ist "
                + zahlenliste[zahlenliste.length - 1]);

        return zahlenliste;
    }
}
