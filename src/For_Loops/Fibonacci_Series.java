package For_Loops;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String [] args) {
		

		Scanner s = new Scanner (System.in);
		System.out.println("Enter how many fibonacci Terms : ");
		int n = s.nextInt();
		
		int fn = 1;
		int Sn = 0;
		int Ln = 1;
		while (Ln <= n) {
			
			int Pn = fn + Sn;
			System.out.println(Pn);
			fn = Sn ; 
			Sn = Pn ; 
			Ln++;
		}
	}
}
