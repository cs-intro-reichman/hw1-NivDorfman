// Splits a restaurant bill evenly among three diners.
import java.util.Scanner; 
public class Bill3 {
	public static void main(String[] args) {
            // calculates the price each diner should pay
      	    double cost = Math.ceil((Double.parseDouble(args[3]))/3); 
            System.out.println("Dear " + args[2] + ", " + args[1] + ", and " + args[0] + ": pay " + cost + " Shekels each");
	}
}
