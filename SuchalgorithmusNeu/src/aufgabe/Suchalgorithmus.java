package aufgabe;


public class Suchalgorithmus {

    public static int lineareSuche(long[] zahlen, long gesucht) {

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }

    public static int binaereSuche(long[] zahlen, long gesucht) {

        int links = 0;
        int rechts = zahlen.length - 1;

        while (links <= rechts) {

            int mitte = (links + rechts) / 2;

            if (zahlen[mitte] == gesucht) {
                return mitte;
            }

            if (zahlen[mitte] < gesucht) {
                links = mitte + 1;
            } else {
                rechts = mitte - 1;
            }
        }

        return -1;
    }
}
