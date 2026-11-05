import java.util.Scanner;

public class TestPrimzahl{
	
public static void main(String[] args) {
	
	
Scanner scan = new Scanner(System.in);

Stoppuhr stopp = new Stoppuhr();

System.out.print("Bitte geben Sie eine Zahl an: ");
long primzahl = scan.nextLong();

stopp.start();
boolean isPrim = Primzahl.isPrim(primzahl);
stopp.stopp();

System.out.println(primzahl + " ist eine Primzahl: " + isPrim);
System.out.println("Dauer: " + stopp.getMillis() + "ms");
}
}

