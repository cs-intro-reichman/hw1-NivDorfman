// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
			
		System.out.println(Integer.parseInt(args[0])/100 + " hundreds, " + (Integer.parseInt(args[0])/10)%10 + " tens, and " + Integer.parseInt(args[0])%10 + " ones");
	}
}
