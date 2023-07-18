package conditional_Statements;

import java.util.Scanner;

public class Kid_Teen_Adult {
	public static void main(String [] args){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you Age : ");
		int a  = scanner.nextInt();
		System.out.println(" The Age Entered : "+a);
		
	
		if (a <= 12) 
		{
			System.out.println(" You are a Kid!");
			
		}else if ((a >= 13)&&(a <= 18)) 
		{
			System.out.println( " You are a Teen!");
		}else if ((a >= 19)&&(a<= 62)) 
		{
			System.out.println( " You are an Adult!");
		}else
		{
			System.out.println(" You are a Senior Citizen");
		}

//		System.out.println("First Is: " +args [0]);
//		System.out.println("Second Is:" +args [1]);
	}
}
