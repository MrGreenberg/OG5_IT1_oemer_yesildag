
import java.util.*;

public class Primzahlen {
	
	
	public static boolean istPrim (int zahl) {
		if (zahl <= 1) {
			return false;
		}
		
		if (zahl == 2) {
			return true;
		}
		
		if (zahl % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i * i <= zahl; i += 2) {
			if (zahl % i == 0) {
				return false;
			}
		}
		
		
		
		return true;
		
		
	}
	
		
		
		
		
	}
