// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		Random rand = new Random();

		int a = rand.nextInt(1,lim);
		int b = rand.nextInt(1,lim);
		int c = rand.nextInt(1,lim);
		int min,max,temp;

		min = Math.min(a,b);
		min = Math.min(min,c);

		max = Math.max(a,b);
		max = Math.max(max,c);
		temp = a + b + c -(min + max); 

		System.out.println(a+","+b+","+c);
		System.out.println(min + " " + temp + " " + max);	}
}
