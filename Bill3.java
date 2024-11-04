// Splits a restaurant bill evenly among three diners.
import java.util.Scanner; 
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
            // calculates the price each diner should pay
      	    double cost = Math.ceil((Double.parseDouble(args[3]))/3); 
            System.out.println("Dear " + args[0] + ", " + args[1] + ", and " + args[2] + ": pay " + cost + " shekels each");	
	}
}
