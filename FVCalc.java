// Computes the future value of a saving investment.
import java.util.Scanner; 
public class FVCalc {
	public static void main(String[] args){

		String temp = args[0];   
		int CurrentValue = Integer.parseInt(args[0]);
		double AnnualInterest = Double.parseDouble(args[1]);
		int year = Integer.parseInt(args[2]);
		//calculates the future investment after x years by CurrentValue*(1+AnnualInterest)^year)
		double FutureValue = CurrentValue*(Math.pow(1+AnnualInterest/100 , (double)year));
		System.out.println("After " + year + " years, a $" + CurrentValue + " saved at " + AnnualInterest + "% will yield $" + (int) FutureValue );
	}
}
