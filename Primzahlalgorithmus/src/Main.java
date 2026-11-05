
public class Main {

    public static void main(String[] args) {

      
        Timer timer = new Timer();

        timer.start();

        
        int zahl = 17;

        if (Primzahlen.istPrim(zahl)) {
            System.out.println(zahl + " ist eine Primzahl.");
        } else {
            System.out.println(zahl + " ist keine Primzahl.");
        }

      
        System.out.println(timer.stop());
    }
}