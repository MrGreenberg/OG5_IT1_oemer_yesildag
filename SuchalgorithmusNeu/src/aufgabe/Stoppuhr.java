package aufgabe;


public class Stoppuhr {

    private long startzeit;

    public void starten() {
        startzeit = System.nanoTime();
    }

    public double stoppen() {
        long endzeit = System.nanoTime();

        return (endzeit - startzeit) / 1000000.0;
    }
}
