package conditional_Statements;

public class Grades {

	public static void main(String [] args) {
		
		float g = (float) 99.9;
		
		if (g >= 90) {
			System.out.println("Your Grade is  A");
			
		}else if ((g <= 89)&& (g >= 80 ))
		{
			System.out.println(" Your Grade is B");
		}else if ((g <= 79)&& (g  >= 70)) 
		{	
			System.out.println(" Your Grade is C");
		}else if ((g <= 69)&&(g >= 60)) 
		{
			System.out.println(" Your Grade is D");	
		}else {
			System.out.println("Your Grade is  F");
		}
				
	}
}
