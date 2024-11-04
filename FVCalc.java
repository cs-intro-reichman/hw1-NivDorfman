// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		Scanner Val = new Scanner(System.in);	

        System.out.print("Enter current value: ");
        int CurrentValue = Val.nextInt();

       

		Scanner an = new Scanner(System.in);	

        System.out.print("Enter annual interest: ");
        String annual = an.nextLine();
		double AnnualInterest = Double.parseDouble(annual);
   

		
		Scanner Yr = new Scanner(System.in);	

        System.out.print("Enter year: ");
        int year = Yr.nextInt();


		double FutureValue = CurrentValue*(Math.pow(1+AnnualInterest/100 , (double)year));
		System.out.println("After: " + year + " years a $" + CurrentValue + " saved at " + AnnualInterest + "% will yield $" + (int) FutureValue );	}
}
