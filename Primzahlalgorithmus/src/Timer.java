import java.util.*;
public class Timer {

	private long timerStart;
	
	public void start() {
		timerStart = System.currentTimeMillis();
	}
	
	public String stop() {
		long timerStop = System.currentTimeMillis();
		long dauer = timerStop - timerStart;
		
		Long sekunden = dauer / 1000;
		
		return "Dauer: " + sekunden + "Sekunden";
	}
	
	
	
	
	
}
